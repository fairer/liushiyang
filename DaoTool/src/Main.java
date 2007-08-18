import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.StringTokenizer;


public class Main {
	
	public static String tablename ="";
	public static String tablechinaname = "";	
	public static List columns = new ArrayList();
	
	public static void init()  throws IOException {
		Properties tabprops = Resources.getResourceAsProperties("table.properties");
		tablename= tabprops.getProperty("tablename");
		tablechinaname = new String(tabprops.getProperty("tablechinaname").getBytes("iso-8859-1"),"gb2312");
		//
		BufferedReader bf = new BufferedReader(Resources.getResourceAsReader("columns.properties"));
		while(true){
			String str = bf.readLine();
			Map map = new HashMap();
			if(str != null){
				StringTokenizer sk = new StringTokenizer(str);
				String childname = sk.nextToken();
				map.put("childname", childname);
				String childtype = sk.nextToken();
				map.put("childtype", childtype);
				String childcomment = sk.nextToken();
				map.put("childcomment", childcomment);
				if(sk.hasMoreTokens()){
					String isnotnull = sk.nextToken();
					map.put("isnotnull", isnotnull);
				}
				else{
					map.put("isnotnull", "no");
				}
			}
			else{
				break;
			}
			columns.add(map);
		}
	}
	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		init();
		System.out.println("创建domain...");
		productDomain();
		System.out.println("创建Xml...");
		productXml();
	}
	public static void productXml() throws IOException {
		String xmlbody = Resources.getResourceAsString("xml/xmlbody.txt");
		xmlbody = xmlbody.replace("%tablename%", tablename);
		String xmlselect = Resources.getResourceAsString("xml/select/xmlselect.txt");
		String xmlinsert= Resources.getResourceAsString("xml/insert/xmlinsert.txt");
		String xmlupdate= Resources.getResourceAsString("xml/update/xmlupdate.txt");
		String xmldelete= Resources.getResourceAsString("xml/delete/xmldelete.txt");
		xmlselect = xmlselect.replace("%tablename%", tablename);
		xmlselect = xmlselect.replace("%smalltablename%", tablename.toLowerCase());
		xmlinsert = xmlinsert.replace("%tablename%", tablename);
		xmlinsert = xmlinsert.replace("%smalltablename%", tablename.toLowerCase());
		xmlupdate = xmlupdate.replace("%tablename%", tablename);
		xmlupdate = xmlupdate.replace("%smalltablename%", tablename.toLowerCase());
		xmldelete = xmldelete.replace("%tablename%", tablename);
		xmldelete = xmldelete.replace("%smalltablename%", tablename.toLowerCase());
		
		String xmlselectitemmode = Resources.getResourceAsString("xml/select/xmlselectitem.txt");
		String xmlselectparammode= Resources.getResourceAsString("xml/select/xmlselectparam.txt");
		String xmlinsertitemmode= Resources.getResourceAsString("xml/insert/xmlinsertitem.txt");
		String xmlinsertparammode= Resources.getResourceAsString("xml/insert/xmlinsertparam.txt");
		String xmlupdateitemmode = Resources.getResourceAsString("xml/update/xmlupdateitem.txt");
		String xmlselectitems = "",xmlselectparams = "",xmlinsertitems = "", xmlinsertparams = "",xmlupdateitems = "";
		for(int i = 0;i< columns.size();i++){
			String xmlselectitem = xmlselectitemmode;
			String xmlselectparam =xmlselectparammode;
			String xmlinsertitem = xmlinsertitemmode;
			String xmlinsertparam = xmlinsertparammode;
			String xmlupdateitem = xmlupdateitemmode;
			Map map = (Map)columns.get(i);
			String childname = (String)map.get("childname");
			String childtype = (String)map.get("childtype");
			String childcomment = (String)map.get("childcomment");
			xmlselectitem = xmlselectitem.replace("%childname%",childname);
			xmlselectitem = xmlselectitem.replace("%childcomment%",childcomment);
			xmlselectitems = xmlselectitems + xmlselectitem;
			xmlselectparam = xmlselectparam.replace("%childname%",childname);
			xmlselectparam = xmlselectparam.replace("%childcomment%",childcomment);
			xmlselectparams = xmlselectparams + xmlselectparam;
			xmlinsertitem = xmlinsertitem.replace("%childname%",childname);
			xmlinsertitem = xmlinsertitem.replace("%childcomment%",childcomment);
			xmlinsertitems = xmlinsertitems + xmlinsertitem;
			xmlinsertparam = xmlinsertparam.replace("%childname%",childname);
			xmlinsertparam = xmlinsertparam.replace("%childcomment%",childcomment);
			xmlinsertparam = xmlinsertparam.replace("%bigchildtype%",childtype.equals("String")?"VARCHAR":childtype.toUpperCase());
			xmlinsertparams = xmlinsertparams + xmlinsertparam;
			xmlupdateitem = xmlupdateitem.replace("%childname%",childname);
			xmlupdateitem = xmlupdateitem.replace("%childcomment%",childcomment);
			xmlupdateitem = xmlupdateitem.replace("%bigchildtype%",childtype.equals("String")?"VARCHAR":childtype.toUpperCase());
			xmlupdateitems = xmlupdateitems + xmlupdateitem;
		}
		xmlselect = xmlselect.replace("%selectitem%", xmlselectitems);
		xmlselect = xmlselect.replace("%selectparam%", xmlselectparams);
		xmlinsert = xmlinsert.replace("%insertitem%", xmlinsertitems);
		xmlinsert = xmlinsert.replace("%insertparam%", xmlinsertparams);
		xmlupdate = xmlupdate.replace("%updateitem%", xmlupdateitems);
		xmlbody = xmlbody.replace("%select%", xmlselect);
		xmlbody = xmlbody.replace("%insert%", xmlinsert);
		xmlbody = xmlbody.replace("%update%", xmlupdate);
		xmlbody = xmlbody.replace("%delete%", xmldelete);
		File file = new File("dest/dest/"+tablename+".xml");
		file.createNewFile();
		FileWriter fw = new FileWriter(file,false);
		fw.write(xmlbody);
		fw.flush();
		fw.close();
	}
	
	private static void productDomain() throws IOException {
		String domainchilds = "";
		String domainvalidates = "";
		String domainencodegbks ="";
		String domainencodeisos ="";
		String domainbody = Resources.getResourceAsString("domainbody.txt");
		String domainchildmode = Resources.getResourceAsString("domainchild.txt");
		String domainvalidatemode = Resources.getResourceAsString("domainvalidate.txt");
		String domainencodegbkmode = Resources.getResourceAsString("domainencodegbk.txt");
		String domainencodeisomode = Resources.getResourceAsString("domainencodeiso.txt");
		
		domainbody = domainbody.replace("%tablechinaname%", tablechinaname);
		domainbody = domainbody.replace("%tablename%", tablename);
		for(int i = 0;i< columns.size();i++){
				String domainchild = domainchildmode;
				Map map = (Map)columns.get(i);
				String childname = (String)map.get("childname");
				String childtype = (String)map.get("childtype");
				String childcomment = (String)map.get("childcomment");
				domainchild = domainchild.replace("%childname%",childname);
				domainchild = domainchild.replace("%bigchildname%", childname.substring(0,1).toUpperCase()+childname.substring(1,childname.length()));
				domainchild = domainchild.replace("%childtype%",childtype);
				domainchild = domainchild.replace("%childcomment%",childcomment);
				domainchilds = domainchilds + domainchild;
				String isnotnull = (String)map.get("isnotnull");
				if(isnotnull.equals("yes")){
					String domainvalidate = domainvalidatemode;
					domainvalidate = domainvalidate.replace("%childname%", childname);
					domainvalidate = domainvalidate.replace("%childcomment%",childcomment);
					domainvalidates = domainvalidates + domainvalidate;
				}
				if(childtype.equals("String")){
					String domainencodegbk = domainencodegbkmode;
					String domainencodeiso = domainencodeisomode;
					domainencodegbk = domainencodegbk.replace("%childname%", childname);
					domainencodeiso = domainencodeiso.replace("%childname%", childname);
					domainencodegbks = domainencodegbks + domainencodegbk;
					domainencodeisos = domainencodeisos + domainencodeiso;
				}
		}
		domainbody = domainbody.replace("%domainchild%", domainchilds);
		domainbody = domainbody.replace("%domainvalidate%", domainvalidates);
		domainbody = domainbody.replace("%domainencodegbk%", domainencodegbks);
		domainbody = domainbody.replace("%domainencodeiso%", domainencodeisos);
		
		File file = new File("dest/dest/"+tablename+"Domain.java");
		file.createNewFile();
		FileWriter fw = new FileWriter(file,false);
		fw.write(domainbody);
		fw.flush();
		fw.close();
	}
	
}