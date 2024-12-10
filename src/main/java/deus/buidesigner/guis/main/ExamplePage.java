package deus.buidesigner.guis.main;

import deus.buidesigner.BUIDesinger;
import deus.guilib.guimanagement.routing.Page;
import deus.guilib.guimanagement.routing.Router;

public class ExamplePage extends Page {

	public ExamplePage(Router router, String... text) {
		super(BUIDesinger.class, router);

		styleSheetPath = "/assets/"+ BUIDesinger.MOD_ID +"/guis/ExampleBlockGui/test.yaml";
		xmlPath = "/assets/"+ BUIDesinger.MOD_ID +"/guis/ExampleBlockGui/test.xml";
		// XMLProcessor.printChildNodes(XMLProcessor.parseXML(xmlPath),"-",0);

		// ! DON'T DELETE IT
		reloadXml();
		reloadStyles();

	}
}
