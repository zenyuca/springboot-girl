package club.zenyuca.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 *
 * @author yuca 日期：2017-08-10 10:42:24
 */
@Component
@ConfigurationProperties(prefix = "url")
public class Url {
	private String protocol;
	private String domain;
	private String port;

	public String getProtocol() {
		return protocol;
	}

	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	@Override
	public String toString() {
		return "Url [protocol=" + protocol + ", domain=" + domain + ", port=" + port + "]";
	}

}
