/**
 * 
 */
package aayush.test;

import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;

/**
 * @author aayush.n
 *
 */
public class Detailer {

	public String details(String websiteUrl,String type) throws UnknownHostException {
		URL url;
		try {
			url = new URL(websiteUrl);

			String result=null;
			switch(type) {
			case "ipAddress":
				result = InetAddress.getByName(url.getHost()).getHostAddress();
				break;
			case "protocol":
				result = url.getProtocol().toString();
				break;
			case "host":
				result = url.getHost();
				break;
			case "port":
				result=Integer.toString(url.getPort());
				break;
			case "query":
				result=url.getQuery();
				break;
			case "reference":
				result=url.getRef();

			}
			return result;
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return type;
	}
}