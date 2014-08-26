/* $$ This file has been instrumented by Clover 3.1.12#20130627143542579 $$ */package com.sample.mvc.service;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;



import org.junit.Test;

import com.sample.mvc.domain.Employee;
import com.sample.mvc.service.EmployeeService;

public class EmployeeServiceTest {static class __CLR3_1_128686hwlku4t9{public static com_cenqua_clover.CoverageRecorder R;public static com_cenqua_clover.CloverProfile[] profiles = { };static{com_cenqua_clover.CoverageRecorder _R=null;try{com_cenqua_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___3_1_12();if(20130627143542579L!=com_cenqua_clover.CloverVersionInfo.getBuildStamp()){com_cenqua_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_cenqua_clover.Clover.l("[CLOVER] WARNING: Instr=3.1.12#20130627143542579,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum()+"#"+com_cenqua_clover.CloverVersionInfo.getBuildStamp());}R=com_cenqua_clover.Clover.getNullRecorder();_R=com_cenqua_clover.Clover.getNullRecorder();_R=com_cenqua_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0070\u0072\u0061\u006b\u0061\u0073\u0068\u0073\u0069\u006e\u0068\u0061\u0062\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1403152612223L,8589935092L,398,profiles,new String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}
	List<Employee> employeeList = new ArrayList<Employee>();
	List<Employee> empList = new ArrayList<Employee>();
	EmployeeService empService = new EmployeeService();
	Employee emp = new Employee();
	Employee employee = new Employee();

	/**
	 * Check weather employeelist return from empservice and actual employee
	 * list are same
	 */
	@Test
	public void testAddTrue() {__CLR3_1_128686hwlku4t9.R.globalSliceStart(getClass().getName(),294);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR3_1_12y9u2kc86();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR3_1_128686hwlku4t9.R.rethrow($CLV_t2$);}finally{__CLR3_1_128686hwlku4t9.R.globalSliceEnd(getClass().getName(),"com.sample.mvc.service.EmployeeServiceTest.testAddTrue",294,$CLV_p$,$CLV_t$);}}private void  __CLR3_1_12y9u2kc86(){try{__CLR3_1_128686hwlku4t9.R.inc(294);
		__CLR3_1_128686hwlku4t9.R.inc(295);System.out.println(":::::");
		__CLR3_1_128686hwlku4t9.R.inc(296);emp.setCode(11);
		__CLR3_1_128686hwlku4t9.R.inc(297);emp.setName("cybage");
		__CLR3_1_128686hwlku4t9.R.inc(298);emp.setCity("Delhi");
		__CLR3_1_128686hwlku4t9.R.inc(299);System.out.println("Set City :::::" + emp.getCity());
		__CLR3_1_128686hwlku4t9.R.inc(300);employeeList.add(emp);
		__CLR3_1_128686hwlku4t9.R.inc(301);empService.setEmployeeList(employeeList);
		__CLR3_1_128686hwlku4t9.R.inc(302);empList.add(emp);
		__CLR3_1_128686hwlku4t9.R.inc(303);empService.addEmployee(emp);
		__CLR3_1_128686hwlku4t9.R.inc(304);assertNotNull(emp);
	}finally{__CLR3_1_128686hwlku4t9.R.flushNeeded();}}

	/**
	 * Pass emplist as Null and check weather employee list return from
	 * empservice and actual emplist are not same
	 */
	@Test
	public void testAddFalse() {__CLR3_1_128686hwlku4t9.R.globalSliceStart(getClass().getName(),305);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR3_1_12l2mgl78h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR3_1_128686hwlku4t9.R.rethrow($CLV_t2$);}finally{__CLR3_1_128686hwlku4t9.R.globalSliceEnd(getClass().getName(),"com.sample.mvc.service.EmployeeServiceTest.testAddFalse",305,$CLV_p$,$CLV_t$);}}private void  __CLR3_1_12l2mgl78h(){try{__CLR3_1_128686hwlku4t9.R.inc(305);
		__CLR3_1_128686hwlku4t9.R.inc(306);emp.setCode(11);
		__CLR3_1_128686hwlku4t9.R.inc(307);emp.setName("cybage");
		__CLR3_1_128686hwlku4t9.R.inc(308);emp.setCity("Delhi");
		__CLR3_1_128686hwlku4t9.R.inc(309);empService.setEmployeeList(employeeList);
		__CLR3_1_128686hwlku4t9.R.inc(310);empList.add(null);
		__CLR3_1_128686hwlku4t9.R.inc(311);empService.addEmployee(emp);
		__CLR3_1_128686hwlku4t9.R.inc(312);assertNotSame(empList, empService.getEmployeeList());
	}finally{__CLR3_1_128686hwlku4t9.R.flushNeeded();}}

	/**
	 * Positive scenario test for findEmployeeCode method
	 */
	@Test
	public void findByEmployeeCodeTrue() {__CLR3_1_128686hwlku4t9.R.globalSliceStart(getClass().getName(),313);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR3_1_126853c08p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR3_1_128686hwlku4t9.R.rethrow($CLV_t2$);}finally{__CLR3_1_128686hwlku4t9.R.globalSliceEnd(getClass().getName(),"com.sample.mvc.service.EmployeeServiceTest.findByEmployeeCodeTrue",313,$CLV_p$,$CLV_t$);}}private void  __CLR3_1_126853c08p(){try{__CLR3_1_128686hwlku4t9.R.inc(313);

		__CLR3_1_128686hwlku4t9.R.inc(314);emp.setCode(1);
		__CLR3_1_128686hwlku4t9.R.inc(315);emp.setName("cybage");
		__CLR3_1_128686hwlku4t9.R.inc(316);emp.setCity("Delhi");
		__CLR3_1_128686hwlku4t9.R.inc(317);employee.setCode(2);
		__CLR3_1_128686hwlku4t9.R.inc(318);employee.setName("cyb");
		__CLR3_1_128686hwlku4t9.R.inc(319);employee.setCity("Delhi");
		__CLR3_1_128686hwlku4t9.R.inc(320);employeeList.add(emp);
		__CLR3_1_128686hwlku4t9.R.inc(321);employeeList.add(employee);

		__CLR3_1_128686hwlku4t9.R.inc(322);empService.setEmployeeList(employeeList);
		__CLR3_1_128686hwlku4t9.R.inc(323);assertEquals("Find Employee Successfully done", 1, empService
				.findByEmployeeCode(1).getCode());
	}finally{__CLR3_1_128686hwlku4t9.R.flushNeeded();}}

	/**
	 * Negative scenario test for findEmployeeCode method
	 */
	@Test
	public void findByEmployeeCodeFalse() {__CLR3_1_128686hwlku4t9.R.globalSliceStart(getClass().getName(),324);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR3_1_12204g4h90();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR3_1_128686hwlku4t9.R.rethrow($CLV_t2$);}finally{__CLR3_1_128686hwlku4t9.R.globalSliceEnd(getClass().getName(),"com.sample.mvc.service.EmployeeServiceTest.findByEmployeeCodeFalse",324,$CLV_p$,$CLV_t$);}}private void  __CLR3_1_12204g4h90(){try{__CLR3_1_128686hwlku4t9.R.inc(324);

		__CLR3_1_128686hwlku4t9.R.inc(325);emp.setCode(11);
		__CLR3_1_128686hwlku4t9.R.inc(326);emp.setName("cybage");
		__CLR3_1_128686hwlku4t9.R.inc(327);emp.setCity("Delhi");
		__CLR3_1_128686hwlku4t9.R.inc(328);employee.setCode(12);
		__CLR3_1_128686hwlku4t9.R.inc(329);employee.setName("cyb");
		__CLR3_1_128686hwlku4t9.R.inc(330);employee.setCity("Delhi");
		__CLR3_1_128686hwlku4t9.R.inc(331);employeeList.add(emp);
		__CLR3_1_128686hwlku4t9.R.inc(332);employeeList.add(employee);

		__CLR3_1_128686hwlku4t9.R.inc(333);empService.setEmployeeList(employeeList);
		__CLR3_1_128686hwlku4t9.R.inc(334);assertNotSame(12, empService.findByEmployeeCode(11).getCode());
		__CLR3_1_128686hwlku4t9.R.inc(335);assertNull(empService.findByEmployeeCode(13));
	}finally{__CLR3_1_128686hwlku4t9.R.flushNeeded();}}
	
	@Test
	public void deleteEmployeeTrue() {__CLR3_1_128686hwlku4t9.R.globalSliceStart(getClass().getName(),336);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR3_1_12q0ooi9c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR3_1_128686hwlku4t9.R.rethrow($CLV_t2$);}finally{__CLR3_1_128686hwlku4t9.R.globalSliceEnd(getClass().getName(),"com.sample.mvc.service.EmployeeServiceTest.deleteEmployeeTrue",336,$CLV_p$,$CLV_t$);}}private void  __CLR3_1_12q0ooi9c(){try{__CLR3_1_128686hwlku4t9.R.inc(336);
		__CLR3_1_128686hwlku4t9.R.inc(337);emp.setCode(11);
		__CLR3_1_128686hwlku4t9.R.inc(338);emp.setName("cybage");
		__CLR3_1_128686hwlku4t9.R.inc(339);emp.setCity("Delhi");
		__CLR3_1_128686hwlku4t9.R.inc(340);employee.setCode(12);
		__CLR3_1_128686hwlku4t9.R.inc(341);employee.setName("cyb");
		__CLR3_1_128686hwlku4t9.R.inc(342);employee.setCity("Delhi");
		__CLR3_1_128686hwlku4t9.R.inc(343);employeeList.add(emp);
		__CLR3_1_128686hwlku4t9.R.inc(344);employeeList.add(employee);
		__CLR3_1_128686hwlku4t9.R.inc(345);empService.setEmployeeList(employeeList);
		__CLR3_1_128686hwlku4t9.R.inc(346);boolean actual = empService.deleteEmployee(12);
		__CLR3_1_128686hwlku4t9.R.inc(347);boolean expected = true;
		__CLR3_1_128686hwlku4t9.R.inc(348);empList.add(emp);
		__CLR3_1_128686hwlku4t9.R.inc(349);assertSame(expected, actual);
	}finally{__CLR3_1_128686hwlku4t9.R.flushNeeded();}}
	
	@Test
	public void deleteEmployeeFalse() {__CLR3_1_128686hwlku4t9.R.globalSliceStart(getClass().getName(),350);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR3_1_124bremn9q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR3_1_128686hwlku4t9.R.rethrow($CLV_t2$);}finally{__CLR3_1_128686hwlku4t9.R.globalSliceEnd(getClass().getName(),"com.sample.mvc.service.EmployeeServiceTest.deleteEmployeeFalse",350,$CLV_p$,$CLV_t$);}}private void  __CLR3_1_124bremn9q(){try{__CLR3_1_128686hwlku4t9.R.inc(350);
		__CLR3_1_128686hwlku4t9.R.inc(351);emp.setCode(11);
		__CLR3_1_128686hwlku4t9.R.inc(352);emp.setName("cybage");
		__CLR3_1_128686hwlku4t9.R.inc(353);emp.setCity("Delhi");
		__CLR3_1_128686hwlku4t9.R.inc(354);employee.setCode(12);
		__CLR3_1_128686hwlku4t9.R.inc(355);employee.setName("cyb");
		__CLR3_1_128686hwlku4t9.R.inc(356);employee.setCity("Delhi");
		__CLR3_1_128686hwlku4t9.R.inc(357);employeeList.add(emp);
		__CLR3_1_128686hwlku4t9.R.inc(358);employeeList.add(employee);
		__CLR3_1_128686hwlku4t9.R.inc(359);empService.setEmployeeList(employeeList);
		__CLR3_1_128686hwlku4t9.R.inc(360);boolean actual = empService.deleteEmployee(13);
		__CLR3_1_128686hwlku4t9.R.inc(361);boolean expected = false;
		__CLR3_1_128686hwlku4t9.R.inc(362);empList.add(emp);
		__CLR3_1_128686hwlku4t9.R.inc(363);assertSame(expected, actual);	
	}finally{__CLR3_1_128686hwlku4t9.R.flushNeeded();}}
	
	@Test
	public void editEmployeeTrue() {__CLR3_1_128686hwlku4t9.R.globalSliceStart(getClass().getName(),364);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR3_1_12y7mkta4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR3_1_128686hwlku4t9.R.rethrow($CLV_t2$);}finally{__CLR3_1_128686hwlku4t9.R.globalSliceEnd(getClass().getName(),"com.sample.mvc.service.EmployeeServiceTest.editEmployeeTrue",364,$CLV_p$,$CLV_t$);}}private void  __CLR3_1_12y7mkta4(){try{__CLR3_1_128686hwlku4t9.R.inc(364);
		__CLR3_1_128686hwlku4t9.R.inc(365);emp.setCode(11);
		__CLR3_1_128686hwlku4t9.R.inc(366);emp.setName("cybage");
		__CLR3_1_128686hwlku4t9.R.inc(367);emp.setCity("Delhi");
		__CLR3_1_128686hwlku4t9.R.inc(368);employee.setCode(12);
		__CLR3_1_128686hwlku4t9.R.inc(369);employee.setName("cyb");
		__CLR3_1_128686hwlku4t9.R.inc(370);employee.setCity("Delhi");
		__CLR3_1_128686hwlku4t9.R.inc(371);employeeList.add(emp);
		__CLR3_1_128686hwlku4t9.R.inc(372);employeeList.add(employee);
		__CLR3_1_128686hwlku4t9.R.inc(373);empService.setEmployeeList(employeeList);
		
		__CLR3_1_128686hwlku4t9.R.inc(374);Employee editEmp = new Employee();
		__CLR3_1_128686hwlku4t9.R.inc(375);editEmp.setCode(12);
		__CLR3_1_128686hwlku4t9.R.inc(376);editEmp.setName("Manjul");
		__CLR3_1_128686hwlku4t9.R.inc(377);editEmp.setCity("Kanpur");
		__CLR3_1_128686hwlku4t9.R.inc(378);boolean actual=empService.editEmployee(editEmp);
		__CLR3_1_128686hwlku4t9.R.inc(379);boolean expected = true;
		__CLR3_1_128686hwlku4t9.R.inc(380);assertSame(expected, actual);
	}finally{__CLR3_1_128686hwlku4t9.R.flushNeeded();}}
	
	@Test
	public void editEmployeeFalse() {__CLR3_1_128686hwlku4t9.R.globalSliceStart(getClass().getName(),381);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR3_1_12nhprlaal();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR3_1_128686hwlku4t9.R.rethrow($CLV_t2$);}finally{__CLR3_1_128686hwlku4t9.R.globalSliceEnd(getClass().getName(),"com.sample.mvc.service.EmployeeServiceTest.editEmployeeFalse",381,$CLV_p$,$CLV_t$);}}private void  __CLR3_1_12nhprlaal(){try{__CLR3_1_128686hwlku4t9.R.inc(381);
		__CLR3_1_128686hwlku4t9.R.inc(382);emp.setCode(11);
		__CLR3_1_128686hwlku4t9.R.inc(383);emp.setName("cybage");
		__CLR3_1_128686hwlku4t9.R.inc(384);emp.setCity("Delhi");
		__CLR3_1_128686hwlku4t9.R.inc(385);employee.setCode(12);
		__CLR3_1_128686hwlku4t9.R.inc(386);employee.setName("cyb");
		__CLR3_1_128686hwlku4t9.R.inc(387);employee.setCity("Delhi");
		__CLR3_1_128686hwlku4t9.R.inc(388);employeeList.add(emp);
		__CLR3_1_128686hwlku4t9.R.inc(389);employeeList.add(employee);
		__CLR3_1_128686hwlku4t9.R.inc(390);empService.setEmployeeList(employeeList);
		
		__CLR3_1_128686hwlku4t9.R.inc(391);Employee editEmp = new Employee();
		__CLR3_1_128686hwlku4t9.R.inc(392);editEmp.setCode(13);
		__CLR3_1_128686hwlku4t9.R.inc(393);editEmp.setName("Manjul");
		__CLR3_1_128686hwlku4t9.R.inc(394);editEmp.setCity("Kanpur");
		__CLR3_1_128686hwlku4t9.R.inc(395);boolean actual=empService.editEmployee(editEmp);
		__CLR3_1_128686hwlku4t9.R.inc(396);boolean expected = true;
		__CLR3_1_128686hwlku4t9.R.inc(397);assertNotSame(expected, actual);
	}finally{__CLR3_1_128686hwlku4t9.R.flushNeeded();}}
}
