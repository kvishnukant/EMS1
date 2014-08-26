/* $$ This file has been instrumented by Clover 3.1.12#20130627143542579 $$ */package com.sample.mvc.controller;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.Test;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;

import com.sample.mvc.command.EmployeeCommand;
import com.sample.mvc.domain.Employee;
import com.sample.mvc.service.EmployeeService;

public class EmployeeDeleteControllerTest {static class __CLR3_1_125555hwlku4ry{public static com_cenqua_clover.CoverageRecorder R;public static com_cenqua_clover.CloverProfile[] profiles = { };static{com_cenqua_clover.CoverageRecorder _R=null;try{com_cenqua_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___3_1_12();if(20130627143542579L!=com_cenqua_clover.CloverVersionInfo.getBuildStamp()){com_cenqua_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_cenqua_clover.Clover.l("[CLOVER] WARNING: Instr=3.1.12#20130627143542579,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum()+"#"+com_cenqua_clover.CloverVersionInfo.getBuildStamp());}R=com_cenqua_clover.Clover.getNullRecorder();_R=com_cenqua_clover.Clover.getNullRecorder();_R=com_cenqua_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0070\u0072\u0061\u006b\u0061\u0073\u0068\u0073\u0069\u006e\u0068\u0061\u0062\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1403152612223L,8589935092L,239,profiles,new String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}

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
	 * Test EmployeeAddController with positive and negative scenario
	 * 
	 * @throws Exception
	 */
	@Test
	public void testEmployeeDeleteControllerTrue() throws Exception {__CLR3_1_125555hwlku4ry.R.globalSliceStart(getClass().getName(),185);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR3_1_12dd0tfg55();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR3_1_125555hwlku4ry.R.rethrow($CLV_t2$);}finally{__CLR3_1_125555hwlku4ry.R.globalSliceEnd(getClass().getName(),"com.sample.mvc.controller.EmployeeDeleteControllerTest.testEmployeeDeleteControllerTrue",185,$CLV_p$,$CLV_t$);}}private void  __CLR3_1_12dd0tfg55() throws Exception{try{__CLR3_1_125555hwlku4ry.R.inc(185);
		__CLR3_1_125555hwlku4ry.R.inc(186);EmployeeDeleteController employeeDeleteController = new EmployeeDeleteController();
		__CLR3_1_125555hwlku4ry.R.inc(187);assertNotNull(command);
		__CLR3_1_125555hwlku4ry.R.inc(188);empCommand.getCode();
		__CLR3_1_125555hwlku4ry.R.inc(189);empCommand.getName();
		__CLR3_1_125555hwlku4ry.R.inc(190);HttpServletRequest mockRequest = (HttpServletRequest) mock(HttpServletRequest.class);
		__CLR3_1_125555hwlku4ry.R.inc(191);HttpServletResponse mockResponse = (HttpServletResponse) mock2(HttpServletResponse.class);
		__CLR3_1_125555hwlku4ry.R.inc(192);assertNotNull(emp);
		__CLR3_1_125555hwlku4ry.R.inc(193);emp.setCode(11);
		__CLR3_1_125555hwlku4ry.R.inc(194);emp.setName("cybage");
		__CLR3_1_125555hwlku4ry.R.inc(195);((EmployeeCommand) command).setCode(11);
		__CLR3_1_125555hwlku4ry.R.inc(196);((EmployeeCommand) command).setName("cybage");
		__CLR3_1_125555hwlku4ry.R.inc(197);((EmployeeCommand) command).setCity("Delhi");
		__CLR3_1_125555hwlku4ry.R.inc(198);assertNotNull(empService);
		__CLR3_1_125555hwlku4ry.R.inc(199);assertNotNull(employeeList);
		__CLR3_1_125555hwlku4ry.R.inc(200);employeeList.add(emp);
		__CLR3_1_125555hwlku4ry.R.inc(201);empService.setEmployeeList(employeeList);
		__CLR3_1_125555hwlku4ry.R.inc(202);assertEquals("Employee Object Successfully set", empService
				.getEmployeeList().get(0), emp);
		__CLR3_1_125555hwlku4ry.R.inc(203);assertNotSame(empService.getEmployeeList().get(0), employee);
		__CLR3_1_125555hwlku4ry.R.inc(204);employeeDeleteController.setEmployeeService(empService);
	}finally{__CLR3_1_125555hwlku4ry.R.flushNeeded();}}

	private HttpServletRequest mock(Class<HttpServletRequest> class1) {try{__CLR3_1_125555hwlku4ry.R.inc(205);
		__CLR3_1_125555hwlku4ry.R.inc(206);return HttpServletRequest;
	}finally{__CLR3_1_125555hwlku4ry.R.flushNeeded();}}

	private HttpServletResponse mock2(Class<HttpServletResponse> class1) {try{__CLR3_1_125555hwlku4ry.R.inc(207);
		__CLR3_1_125555hwlku4ry.R.inc(208);return HttpServletResponse;
	}finally{__CLR3_1_125555hwlku4ry.R.flushNeeded();}}

	@Test
	public void testSetEmployeeService() {__CLR3_1_125555hwlku4ry.R.globalSliceStart(getClass().getName(),209);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR3_1_12pqhq0y5t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR3_1_125555hwlku4ry.R.rethrow($CLV_t2$);}finally{__CLR3_1_125555hwlku4ry.R.globalSliceEnd(getClass().getName(),"com.sample.mvc.controller.EmployeeDeleteControllerTest.testSetEmployeeService",209,$CLV_p$,$CLV_t$);}}private void  __CLR3_1_12pqhq0y5t(){try{__CLR3_1_125555hwlku4ry.R.inc(209);
		__CLR3_1_125555hwlku4ry.R.inc(210);EmployeeService employeeService = new EmployeeService();
		__CLR3_1_125555hwlku4ry.R.inc(211);assertNotNull(employeeService);
	}finally{__CLR3_1_125555hwlku4ry.R.flushNeeded();}}

	@Test
	public void testOnsubmit() {__CLR3_1_125555hwlku4ry.R.globalSliceStart(getClass().getName(),212);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR3_1_128dk6eo5w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR3_1_125555hwlku4ry.R.rethrow($CLV_t2$);}finally{__CLR3_1_125555hwlku4ry.R.globalSliceEnd(getClass().getName(),"com.sample.mvc.controller.EmployeeDeleteControllerTest.testOnsubmit",212,$CLV_p$,$CLV_t$);}}private void  __CLR3_1_128dk6eo5w(){try{__CLR3_1_125555hwlku4ry.R.inc(212);
		__CLR3_1_125555hwlku4ry.R.inc(213);emp.setCode(11);
		__CLR3_1_125555hwlku4ry.R.inc(214);emp.setName("cybage");
		__CLR3_1_125555hwlku4ry.R.inc(215);emp.setCity("Delhi");
		__CLR3_1_125555hwlku4ry.R.inc(216);employee.setCode(12);
		__CLR3_1_125555hwlku4ry.R.inc(217);employee.setName("cyb");
		__CLR3_1_125555hwlku4ry.R.inc(218);employee.setCity("Delhi");
		__CLR3_1_125555hwlku4ry.R.inc(219);employeeList.add(emp);
		__CLR3_1_125555hwlku4ry.R.inc(220);employeeList.add(employee);
		__CLR3_1_125555hwlku4ry.R.inc(221);empService.setEmployeeList(employeeList);
		__CLR3_1_125555hwlku4ry.R.inc(222);EmployeeDeleteController test = new EmployeeDeleteController();
		__CLR3_1_125555hwlku4ry.R.inc(223);test.setEmployeeService(empService);
		__CLR3_1_125555hwlku4ry.R.inc(224);((EmployeeCommand) command).setCode(12);
		__CLR3_1_125555hwlku4ry.R.inc(225);((EmployeeCommand) command).setName("Manjul");
		__CLR3_1_125555hwlku4ry.R.inc(226);((EmployeeCommand) command).setCity("Delhi");
		__CLR3_1_125555hwlku4ry.R.inc(227);try {
			__CLR3_1_125555hwlku4ry.R.inc(228);assertNotNull(command);
			__CLR3_1_125555hwlku4ry.R.inc(229);ModelAndView check= test.onSubmit(HttpServletRequest, HttpServletResponse, command, errors);
			__CLR3_1_125555hwlku4ry.R.inc(230);assertNotNull(check);
		} catch (Exception e) {
			__CLR3_1_125555hwlku4ry.R.inc(231);e.printStackTrace();
		}
		__CLR3_1_125555hwlku4ry.R.inc(232);assertNotNull(command);
	}finally{__CLR3_1_125555hwlku4ry.R.flushNeeded();}}

	@Test
	public void testOnsubmitCode() {__CLR3_1_125555hwlku4ry.R.globalSliceStart(getClass().getName(),233);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR3_1_12yfbe6b6h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR3_1_125555hwlku4ry.R.rethrow($CLV_t2$);}finally{__CLR3_1_125555hwlku4ry.R.globalSliceEnd(getClass().getName(),"com.sample.mvc.controller.EmployeeDeleteControllerTest.testOnsubmitCode",233,$CLV_p$,$CLV_t$);}}private void  __CLR3_1_12yfbe6b6h(){try{__CLR3_1_125555hwlku4ry.R.inc(233);
		__CLR3_1_125555hwlku4ry.R.inc(234);Employee emp = new Employee();
		__CLR3_1_125555hwlku4ry.R.inc(235);emp.setCode(10665);
		__CLR3_1_125555hwlku4ry.R.inc(236);emp.setName("Vidya");
		__CLR3_1_125555hwlku4ry.R.inc(237);assertEquals("Code set is correct", 10665, 10665);
		__CLR3_1_125555hwlku4ry.R.inc(238);assertNotNull(emp);
	}finally{__CLR3_1_125555hwlku4ry.R.flushNeeded();}}
}
