package generics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import javax.imageio.stream.FileImageInputStream;

public class Generic_propertyfile 
{
public String propertyfile(String path,String key) throws FileNotFoundException, IOException
{
	Properties p=new Properties();
	p.load(new FileInputStream(path));
	 return p.getProperty(key);
	
	
}
}
