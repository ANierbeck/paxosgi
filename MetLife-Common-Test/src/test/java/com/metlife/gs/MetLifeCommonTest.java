package com.metlife.gs;

import static org.junit.Assert.assertNotNull;
import static org.ops4j.pax.exam.CoreOptions.junitBundles;
import static org.ops4j.pax.exam.CoreOptions.mavenBundle;
import static org.ops4j.pax.exam.CoreOptions.options;
import static org.ops4j.pax.exam.CoreOptions.frameworkProperty;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.ops4j.pax.exam.Configuration;
import org.ops4j.pax.exam.Option;
import org.ops4j.pax.exam.junit.PaxExam;
import org.ops4j.pax.exam.spi.reactors.ExamReactorStrategy;
import org.ops4j.pax.exam.spi.reactors.PerMethod;
import org.osgi.framework.BundleContext;

import com.metlife.gs.api.GSvPMetLifeCommonBaseTOInterface;

@RunWith(PaxExam.class)
@ExamReactorStrategy(PerMethod.class)
public class MetLifeCommonTest {

	@Inject
	GSvPMetLifeCommonBaseTOInterface gSvPMetLifeCommonBaseTOInterface;

	@Inject
	BundleContext bc;

	@Configuration
	public Option[] config() {

		return options(

				mavenBundle("com.metlife.gsvp.common", "MetLife-Common").versionAsInProject(),
				mavenBundle("org.apache.felix", "org.apache.felix.scr.annotations").versionAsInProject(),

				mavenBundle().groupId("org.apache.felix").artifactId("org.apache.felix.scr").versionAsInProject(),

				mavenBundle().groupId("org.apache.servicemix.bundles").artifactId("org.apache.servicemix.bundles.json")
						.versionAsInProject(),

				mavenBundle().groupId("org.ops4j.pax.logging").artifactId("pax-logging-service").version("1.8.1"),

				mavenBundle().groupId("org.ops4j.pax.logging").artifactId("pax-logging-api").version("1.8.1"),

				junitBundles(), frameworkProperty("osgi.console").value("6666"));
	}

	@Test
	public void testGetJSON() {

		// System.setProperty("java.rmi.server.hostname", "US1247782");
		// systemProperty("java.rmi.server.hostname").value("US1247782");
		assertNotNull(bc);
		assertNotNull(gSvPMetLifeCommonBaseTOInterface);
		// System.out.println( "BundleContext of bundle injected: " +
		// bc.getBundle().getSymbolicName() );

		System.out.println("Testing OSGI with JUnit");
		assertNotNull(gSvPMetLifeCommonBaseTOInterface.getJSON().toString());
	}

}