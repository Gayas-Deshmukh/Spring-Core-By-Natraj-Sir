package com.nt.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("pInfo")
@PropertySource(value = "com/nt/commons/Info.properties")
public class PersonInfo 
{
	// Injecting the values from Properties files to Spring Bean Properties
	@Value("${per.id}")
	private Integer pid;
	
	@Value("${per.name}")
	private String pname;
	
	@Value("${per.addrs}")
	private String Addrs;
	
	// Injecting the direct values to the Spring Bean Properties
	@Value("987456321")
	private Long mobileNo;
	
	// Injecting the System Properties Value
	@Value("${os.name}")
	private String os_name;
	
	@Value("${os.version}")
	private String os_version;
	
	// Injecting env.. variable Value
	@Value("${Path}")
	private String path_data;

	@Override
	public String toString() {
		return "PersonInfo [pid=" + pid + ", pname=" + pname + ", Addrs=" + Addrs + ", mobileNo=" + mobileNo
				+ ", os_name=" + os_name + ", os_version=" + os_version + ", path_data=" + path_data + "]";
	}
	
	
}
