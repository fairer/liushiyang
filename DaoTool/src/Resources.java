

import java.io.*;
import java.net.*;
import java.util.*;

/**
 *
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2004</p>
 * <p>Company: </p>
 * @author 
 * @version 1.0
 */
public class Resources extends Object {

  /** Returns the URL of the resource on the classpath
   * @param resource The resource to find
   * @throws IOException If the resource cannot be found or read
   * @return The resource
   */
  public static URL getResourceURL(String resource) throws IOException {
    URL url = null;
    ClassLoader loader = Resources.class.getClassLoader();
    if (loader != null) url = loader.getResource(resource);
    if (url == null) url = ClassLoader.getSystemResource(resource);
    if (url == null) throw new IOException("Could not find resource " + resource);
    return url;
  }

  /** Returns the URL of the resource on the classpath
   * @param loader The classloader used to load the resource
   * @param resource The resource to find
   * @throws IOException If the resource cannot be found or read
   * @return The resource
   */
  public static URL getResourceURL(ClassLoader loader, String resource) throws IOException {
    URL url = null;
    if (loader != null) url = loader.getResource(resource);
    if (url == null) url = ClassLoader.getSystemResource(resource);
    if (url == null) throw new IOException("Could not find resource " + resource);
    return url;
  }

  /** Returns a resource on the classpath as a Stream object
   * @param resource The resource to find
   * @throws IOException If the resource cannot be found or read
   * @return The resource
   */
  public static InputStream getResourceAsStream(String resource) throws IOException {
    InputStream in = null;
    ClassLoader loader = Resources.class.getClassLoader();
    if (loader != null) in = loader.getResourceAsStream(resource);
    if (in == null) in = ClassLoader.getSystemResourceAsStream(resource);
    if (in == null) throw new IOException("Could not find resource " + resource);
    return in;
  }

  /** Returns a resource on the classpath as a Stream object
   * @param loader The classloader used to load the resource
   * @param resource The resource to find
   * @throws IOException If the resource cannot be found or read
   * @return The resource
   */
  public static InputStream getResourceAsStream(ClassLoader loader, String resource) throws IOException {
    InputStream in = null;
    if (loader != null) in = loader.getResourceAsStream(resource);
    if (in == null) in = ClassLoader.getSystemResourceAsStream(resource);
    if (in == null) throw new IOException("Could not find resource " + resource);
    return in;
  }

  /** Returns a resource on the classpath as a Properties object
   * @param resource The resource to find
   * @throws IOException If the resource cannot be found or read
   * @return The resource
   */
  public static Properties getResourceAsProperties(String resource)
      throws IOException {
    Properties props = new Properties();
    InputStream in = null;
    String propfile = resource;
    in = getResourceAsStream(propfile);
    props.load(in);
    in.close();
    return props;
  }

  /** Returns a resource on the classpath as a Properties object
   * @param loader The classloader used to load the resource
   * @param resource The resource to find
   * @throws IOException If the resource cannot be found or read
   * @return The resource
   */
  public static Properties getResourceAsProperties(ClassLoader loader, String resource)
      throws IOException {
    Properties props = new Properties();
    InputStream in = null;
    String propfile = resource;
    in = getResourceAsStream(loader, propfile);
    props.load(in);
    in.close();
    return props;
  }

  /** Returns a resource on the classpath as a Reader object
   * @param resource The resource to find
   * @throws IOException If the resource cannot be found or read
   * @return The resource
   */
  public static Reader getResourceAsReader(String resource) throws IOException {
    return new InputStreamReader(getResourceAsStream(resource));
  }

  /** Returns a resource on the classpath as a Reader object
   * @param loader The classloader used to load the resource
   * @param resource The resource to find
   * @throws IOException If the resource cannot be found or read
   * @return The resource
   */
  public static Reader getResourceAsReader(ClassLoader loader, String resource) throws IOException {
    return new InputStreamReader(getResourceAsStream(loader, resource));
  }

  /** Returns a resource on the classpath as a File object
   * @param resource The resource to find
   * @throws IOException If the resource cannot be found or read
   * @return The resource
   */
  public static File getResourceAsFile(String resource) throws IOException {
    return new File(getResourceURL(resource).getFile());
  }

  /** Returns a resource on the classpath as a File object
   * @param loader The classloader used to load the resource
   * @param resource The resource to find
   * @throws IOException If the resource cannot be found or read
   * @return The resource
   */
  public static File getResourceAsFile(ClassLoader loader, String resource) throws IOException {
    return new File(getResourceURL(loader, resource).getFile());
  }
  public static String getResourceAsString (String resource) throws IOException{
		
		BufferedReader bf = new BufferedReader(Resources.getResourceAsReader(resource));
		String returns = "";
		while(true){
			String str = bf.readLine();
			if(str != null)
				returns = returns + str + '\n';
			else
				break;
		}
		return returns;
	}
}
