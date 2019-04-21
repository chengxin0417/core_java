package core_java.init_class.class_loader;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

public class URLClassLoaderDemo {

	public static void main(String[] args) throws MalformedURLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
		// TODO Auto-generated method stub
		URL url = new URL("https://github.com/chengxin0417/core_java/");
		URLClassLoader loader = new URLClassLoader(new URL[] {url});
		Class objClass = loader.loadClass("core_java.init_class.final_var.Tester");
		Object obj = objClass.newInstance();
	}

}
