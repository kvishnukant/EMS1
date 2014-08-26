/* $$ This file has been instrumented by Clover 3.1.12#20130627143542579 $$ */package com.sample.mvc.controller;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;

import com.sample.mvc.command.EmployeeCommand;
import com.sample.mvc.domain.Employee;
import com.sample.mvc.service.EmployeeService;

public class EmployeeEditControllerTest {static class __CLR3_1_126n6nhwlku4st{public static com_cenqua_clover.CoverageRecorder R;public static com_cenqua_clover.CloverProfile[] profiles = { };static{com_cenqua_clover.CoverageRecorder _R=null;try{com_cenqua_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___3_1_12();if(20130627143542579L!=com_cenqua_clover.CloverVersionInfo.getBuildStamp()){com_cenqua_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_cenqua_clover.Clover.l("[CLOVER] WARNING: Instr=3.1.12#20130627143542579,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum()+"#"+com_cenqua_clover.CloverVersionInfo.getBuildStamp());}R=com_cenqua_clover.Clover.getNullRecorder();_R=com_cenqua_clover.Clover.getNullRecorder();_R=com_cenqua_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0070\u0072\u0061\u006b\u0061\u0073\u0068\u0073\u0069\u006e\u0068\u0061\u0062\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1403152612223L,8589935092L,294,profiles,new String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}

	Object command = new EmployeeCommand();
	BindException errors;
	EmployeeCommand empCommand = new EmployeeCommand();
	Employee emp = new Employee();
	Employee employee = new Employee();
	private HttpServletRequest HttpServletRequest;
	private HttpServletResponse HttpServletResponse;
	List<Employee> employeeList = new ArrayList<Employee>();
	EmployeeService empService = new EmployeeService();
	
	/**
	 * Test EmployeeEditController with positive and negative scenario
	 * 
	 * @throws Exception
	 */
	@Test
	public void testEmployeeEditControllerTrue() throws Exception {__CLR3_1_126n6nhwlku4st.R.globalSliceStart(getClass().getName(),239);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR3_1_12srpvzv6n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR3_1_126n6nhwlku4st.R.rethrow($CLV_t2$);}finally{__CLR3_1_126n6nhwlku4st.R.globalSliceEnd(getClass().getName(),"com.sample.mvc.controller.EmployeeEditControllerTest.testEmployeeEditControllerTrue",239,$CLV_p$,$CLV_t$);}}private void  __CLR3_1_12srpvzv6n() throws Exception{try{__CLR3_1_126n6nhwlku4st.R.inc(239);
		__CLR3_1_126n6nhwlku4st.R.inc(240);EmployeeEditController employeeEditController = new EmployeeEditController();
		__CLR3_1_126n6nhwlku4st.R.inc(241);assertNotNull(command);
		__CLR3_1_126n6nhwlku4st.R.inc(242);empCommand.getCode();
		__CLR3_1_126n6nhwlku4st.R.inc(243);empCommand.getName();
		__CLR3_1_126n6nhwlku4st.R.inc(244);HttpServletRequest mockRequest = (HttpServletRequest) mock(HttpServletRequest.class);
		__CLR3_1_126n6nhwlku4st.R.inc(245);HttpServletResponse mockResponse = (HttpServletResponse) mock2(HttpServletResponse.class);
		__CLR3_1_126n6nhwlku4st.R.inc(246);assertNotNull(emp);
		__CLR3_1_126n6nhwlku4st.R.inc(247);emp.setCode(11);
		__CLR3_1_126n6nhwlku4st.R.inc(248);emp.setName("cybage");
		__CLR3_1_126n6nhwlku4st.R.inc(249);((EmployeeCommand) command).setCode(11);
		__CLR3_1_126n6nhwlku4st.R.inc(250);((EmployeeCommand) command).setName("cybage");
		__CLR3_1_126n6nhwlku4st.R.inc(251);((EmployeeCommand) command).setCity("Delhi");
		__CLR3_1_126n6nhwlku4st.R.inc(252);assertNotNull(empService);
		__CLR3_1_126n6nhwlku4st.R.inc(253);assertNotNull(employeeList);
		__CLR3_1_126n6nhwlku4st.R.inc(254);employeeList.add(emp);
		__CLR3_1_126n6nhwlku4st.R.inc(255);empService.setEmployeeList(employeeList);
		__CLR3_1_126n6nhwlku4st.R.inc(256);assertEquals("Employee Object Successfully set", empService
				.getEmployeeList().get(0), emp);
		__CLR3_1_126n6nhwlku4st.R.inc(257);assertNotSame(empService.getEmployeeList().get(0), employee);
		__CLR3_1_126n6nhwlku4st.R.inc(258);employeeEditController.setEmployeeService(empService);
	}finally{__CLR3_1_126n6nhwlku4st.R.flushNeeded();}}

	private HttpServletRequest mock(Class<HttpServletRequest> class1) {try{__CLR3_1_126n6nhwlku4st.R.inc(259);
		__CLR3_1_126n6nhwlku4st.R.inc(260);return HttpServletRequest;
	}finally{__CLR3_1_126n6nhwlku4st.R.flushNeeded();}}

	private HttpServletResponse mock2(Class<HttpServletResponse> class1) {try{__CLR3_1_126n6nhwlku4st.R.inc(261);
		__CLR3_1_126n6nhwlku4st.R.inc(262);return HttpServletResponse;
	}finally{__CLR3_1_126n6nhwlku4st.R.flushNeeded();}}

	@Test
	public void testSetEmployeeService() {__CLR3_1_126n6nhwlku4st.R.globalSliceStart(getClass().getName(),263);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR3_1_12pqhq0y7b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR3_1_126n6nhwlku4st.R.rethrow($CLV_t2$);}finally{__CLR3_1_126n6nhwlku4st.R.globalSliceEnd(getClass().getName(),"com.sample.mvc.controller.EmployeeEditControllerTest.testSetEmployeeService",263,$CLV_p$,$CLV_t$);}}private void  __CLR3_1_12pqhq0y7b(){try{__CLR3_1_126n6nhwlku4st.R.inc(263);
		__CLR3_1_126n6nhwlku4st.R.inc(264);EmployeeService employeeService = new EmployeeService();
		__CLR3_1_126n6nhwlku4st.R.inc(265);assertNotNull(employeeService);
	}finally{__CLR3_1_126n6nhwlku4st.R.flushNeeded();}}

	@Test
	public void testOnsubmit() {__CLR3_1_126n6nhwlku4st.R.globalSliceStart(getClass().getName(),266);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR3_1_128dk6eo7e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR3_1_126n6nhwlku4st.R.rethrow($CLV_t2$);}finally{__CLR3_1_126n6nhwlku4st.R.globalSliceEnd(getClass().getName(),"com.sample.mvc.controller.EmployeeEditControllerTest.testOnsubmit",266,$CLV_p$,$CLV_t$);}}private void  __CLR3_1_128dk6eo7e(){try{__CLR3_1_126n6nhwlku4st.R.inc(266);
		__CLR3_1_126n6nhwlku4st.R.inc(267);emp.setCode(11);
		__CLR3_1_126n6nhwlku4st.R.inc(268);emp.setName("cybage");
		__CLR3_1_126n6nhwlku4st.R.inc(269);emp.setCity("Delhi");
		__CLR3_1_126n6nhwlku4st.R.inc(270);employee.setCode(12);
		__CLR3_1_126n6nhwlku4st.R.inc(271);employee.setName("cyb");
		__CLR3_1_126n6nhwlku4st.R.inc(272);employee.setCity("Delhi");
		__CLR3_1_126n6nhwlku4st.R.inc(273);employeeList.add(emp);
		__CLR3_1_126n6nhwlku4st.R.inc(274);employeeList.add(employee);
		__CLR3_1_126n6nhwlku4st.R.inc(275);empService.setEmployeeList(employeeList);
		__CLR3_1_126n6nhwlku4st.R.inc(276);EmployeeEditController test = new EmployeeEditController();
		__CLR3_1_126n6nhwlku4st.R.inc(277);test.setEmployeeService(empService);
		__CLR3_1_126n6nhwlku4st.R.inc(278);((EmployeeCommand) command).setCode(12);
		__CLR3_1_126n6nhwlku4st.R.inc(279);((EmployeeCommand) command).setName("Manjul");
		__CLR3_1_126n6nhwlku4st.R.inc(280);((EmployeeCommand) command).setCity("Delhi");
		__CLR3_1_126n6nhwlku4st.R.inc(281);try {
			__CLR3_1_126n6nhwlku4st.R.inc(282);assertNotNull(command);
			__CLR3_1_126n6nhwlku4st.R.inc(283);ModelAndView check= test.onSubmit(HttpServletRequest, HttpServletResponse, command, errors);
			__CLR3_1_126n6nhwlku4st.R.inc(284);assertNotNull(check);
		} catch (Exception e) {
			__CLR3_1_126n6nhwlku4st.R.inc(285);System.out.println(((EmployeeCommand) command).getCode()+" "+((EmployeeCommand) command).getName()+" "+((EmployeeCommand) command).getCity());
			__CLR3_1_126n6nhwlku4st.R.inc(286);e.printStackTrace();
		}
		__CLR3_1_126n6nhwlku4st.R.inc(287);assertNotNull(command);
	}finally{__CLR3_1_126n6nhwlku4st.R.flushNeeded();}}

	@Test
	public void testOnsubmitCode() {__CLR3_1_126n6nhwlku4st.R.globalSliceStart(getClass().getName(),288);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR3_1_12yfbe6b80();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR3_1_126n6nhwlku4st.R.rethrow($CLV_t2$);}finally{__CLR3_1_126n6nhwlku4st.R.globalSliceEnd(getClass().getName(),"com.sample.mvc.controller.EmployeeEditControllerTest.testOnsubmitCode",288,$CLV_p$,$CLV_t$);}}private void  __CLR3_1_12yfbe6b80(){try{__CLR3_1_126n6nhwlku4st.R.inc(288);
		__CLR3_1_126n6nhwlku4st.R.inc(289);Employee emp = new Employee();
		__CLR3_1_126n6nhwlku4st.R.inc(290);emp.setCode(10665);
		__CLR3_1_126n6nhwlku4st.R.inc(291);emp.setName("Vidya");
		__CLR3_1_126n6nhwlku4st.R.inc(292);assertEquals("Code set is correct", 10665, 10665);
		__CLR3_1_126n6nhwlku4st.R.inc(293);assertNotNull(emp);
	}finally{__CLR3_1_126n6nhwlku4st.R.flushNeeded();}}

}
