package com.nt.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;
import com.nt.beans.PersonInfo;
import com.nt.config.AppConfig;


public class PropertiesFileTest 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        
        PersonInfo personInfo = ctx.getBean("pInfo", PersonInfo.class);
        
        System.out.println(personInfo);
        
        // OutPut
        // PersonInfo [pid=123, pname=Gayas, Addrs=Patoda, mobileNo=987456321, os_name=Windows 11, os_version=10.0, path_data=C:/Users/GAYAS/Downloads/sts-4.15.1.RELEASE//plugins/org.eclipse.justj.openjdk.hotspot.jre.full.win32.x86_64_17.0.3.v20220515-1416/jre/bin/server;C:/Users/GAYAS/Downloads/sts-4.15.1.RELEASE//plugins/org.eclipse.justj.openjdk.hotspot.jre.full.win32.x86_64_17.0.3.v20220515-1416/jre/bin;C:\Program Files\Common Files\Oracle\Java\javapath;C:\Dev SetUp\apache-maven-3.8.6\bin;C:\Program Files\MySQL\MySQL Server 8.0\bin;C:\Program Files\Java\jdk-11.0.17\bin;;%SystemRoot%\system32;%SystemRoot%;%SystemRoot%\System32\Wbem;%SYSTEMROOT%\System32\WindowsPowerShell\v1.0\;%SYSTEMROOT%\System32\OpenSSH\;C:\Users\GAYAS\AppData\Local\Microsoft\WindowsApps;;C:\Users\GAYAS\Downloads\sts-4.15.1.RELEASE;]

        System.out.println("-----------------------------------------------");
        
        Environment	env	=	ctx.getEnvironment();
        
        System.out.println("Os Name : " + env.getProperty("os.name")); 		// Os Name : Windows 11
        System.out.println("PID : " + env.getProperty("per.id")); 			// PID : 123
        System.out.println("Person Name : " + env.getProperty("per.name"));	// Person Name : Gayas
    }
}
