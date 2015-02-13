package com.metlife.gs;

import org.junit.runner.RunWith;
//import org.ops4j.pax.exam.junit.PaxExam;
import org.junit.internal.runners.JUnit4ClassRunner;
import com.metlife.gs.api.*;
import javax.inject.Inject;
import org.ops4j.pax.exam.junit.Configuration;
import org.ops4j.pax.exam.Option;
import org.ops4j.pax.exam.util.Filter;
import org.junit.Test;
import org.osgi.framework.BundleContext;
import static org.junit.Assert.*;
import static org.ops4j.pax.exam.CoreOptions.*;
//import org.ops4j.pax.exam.spi.reactors.ExamReactorStrategy;
//import org.ops4j.pax.exam.spi.reactors.PerClass;

@RunWith(JUnit4ClassRunner.class) 
public class MetLifeCommonTest {

    @Inject @Filter("(timeout=30000)")
	GSvPMetLifeCommonBaseTOInterface gSvPMetLifeCommonBaseTOInterface;
	
	@Inject @Filter("(timeout=30000)")
	BundleContext bc;
	
	@Configuration
    public Option[] config() {
 
        return options(
			
            mavenBundle("com.metlife.gsvp.common", "MetLife-Common"),
			mavenBundle("org.apache.felix", "org.apache.felix.scr.annotations"),
            //bundle("http://www.example.com/repository/foo-1.2.3.jar"),
			//bundle("file:C:\\cygwin64\\home\\phelm\\org.apache.felix.scr.annotations-1.9.10.jar"),
			//bundle("file:C:\\cygwin64\\home\\phelm\\org.apache.felix.scr-1.8.0.jar"),
			mavenBundle().groupId("org.apache.felix").artifactId("org.apache.felix.scr"),
			//bundle("file:C:\\cygwin64\\home\\phelm\\json-1.5.jar"),
			//servicemix bundle provides json
			mavenBundle("org.apache.servicemix.bundles", "org.apache.servicemix.bundles.oro").version("2.0.8_6"),
			mavenBundle("org.apache.servicemix.bundles","org.apache.servicemix.bundles.json-lib").version("2.4_1"),

			//mavenBundle().groupId("org.json").artifactId("json"),
			//bundle("file:C:\\cygwin64\\home\\phelm\\slf4j-api-1.7.10.jar"),
			mavenBundle().groupId("org.slf4j").artifactId("slf4j.api"),
			//bundle("file:C:\\cygwin64\\home\\phelm\\slf4j-simple-1.7.10.jar").noStart(),
			//bundle("file:C:\\cygwin64\\home\\phelm\\gebbes\\CORP_GlobalServicing\\source\\GEB_14.2\\GS_Core_Branch\\MetLife-Common\\target\\MetLife-Common-1.0.jar"),
			mavenBundle().groupId("org.slf4j").artifactId("slf4j-simple").noStart(),
			
            junitBundles()
            );
    }
	
	@Test
	public void testGetJSON() {
	
		//System.setProperty("java.rmi.server.hostname", "US1247782");
		//systemProperty("java.rmi.server.hostname").value("US1247782");
		assertNotNull(bc);
		assertNotNull(gSvPMetLifeCommonBaseTOInterface);
        //System.out.println( "BundleContext of bundle injected: " + bc.getBundle().getSymbolicName() );
		
		System.out.println("Testing OSGI with JUnit");
        assertNotNull(gSvPMetLifeCommonBaseTOInterface.getJSON().toString());
	}
   
}