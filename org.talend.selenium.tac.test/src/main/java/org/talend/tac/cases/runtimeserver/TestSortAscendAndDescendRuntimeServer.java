package org.talend.tac.cases.runtimeserver;

import org.talend.tac.base.WebdriverLogin;
import org.talend.tac.modules.impl.AddRuntimeServerWithInvalidHostImpl;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestSortAscendAndDescendRuntimeServer extends WebdriverLogin {
	AddRuntimeServerWithInvalidHostImpl addRuntimeServerWithInvalidHostImpl;
    @BeforeMethod
    public void beforeMethod(){
    	addRuntimeServerWithInvalidHostImpl = new AddRuntimeServerWithInvalidHostImpl(driver);
    }
    
    @Test
    @Parameters({"DescendingValue","AscendingValue"})
    public void testSortRuntimeServers(String value, String value1) {
    	addRuntimeServerWithInvalidHostImpl.sortESBRuntimeServers(value, value1);    
    }
}
