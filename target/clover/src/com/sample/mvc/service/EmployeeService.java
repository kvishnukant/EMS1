/* $$ This file has been instrumented by Clover 3.1.12#20130627143542579 $$ */package com.sample.mvc.service;

import java.util.Iterator;
import java.util.List;

import com.sample.mvc.domain.Employee;


public class EmployeeService {public static class __CLR3_1_121m1mhwlku4pc{public static com_cenqua_clover.CoverageRecorder R;public static com_cenqua_clover.CloverProfile[] profiles = { };static{com_cenqua_clover.CoverageRecorder _R=null;try{com_cenqua_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___3_1_12();if(20130627143542579L!=com_cenqua_clover.CloverVersionInfo.getBuildStamp()){com_cenqua_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_cenqua_clover.Clover.l("[CLOVER] WARNING: Instr=3.1.12#20130627143542579,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum()+"#"+com_cenqua_clover.CloverVersionInfo.getBuildStamp());}R=com_cenqua_clover.Clover.getNullRecorder();_R=com_cenqua_clover.Clover.getNullRecorder();_R=com_cenqua_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0070\u0072\u0061\u006b\u0061\u0073\u0068\u0073\u0069\u006e\u0068\u0061\u0062\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1403152611990L,8589935092L,96,profiles,new String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}
	
	List<Employee> employeeList;

	public void setEmployeeList(List<Employee> employeeList) {try{__CLR3_1_121m1mhwlku4pc.R.inc(58);
		__CLR3_1_121m1mhwlku4pc.R.inc(59);this.employeeList = employeeList;
	}finally{__CLR3_1_121m1mhwlku4pc.R.flushNeeded();}}

	public List<Employee> getEmployeeList() {try{__CLR3_1_121m1mhwlku4pc.R.inc(60);
		__CLR3_1_121m1mhwlku4pc.R.inc(61);return employeeList;
	}finally{__CLR3_1_121m1mhwlku4pc.R.flushNeeded();}}
	
	public Employee findByEmployeeCode(int code){try{__CLR3_1_121m1mhwlku4pc.R.inc(62);
		__CLR3_1_121m1mhwlku4pc.R.inc(63);for (Employee e: employeeList){{
			__CLR3_1_121m1mhwlku4pc.R.inc(64);if ((((e.getCode() == code)&&(__CLR3_1_121m1mhwlku4pc.R.iget(65)!=0|true))||(__CLR3_1_121m1mhwlku4pc.R.iget(66)==0&false))){{
				__CLR3_1_121m1mhwlku4pc.R.inc(67);return e;
			}
		}}
		}__CLR3_1_121m1mhwlku4pc.R.inc(68);return null;
	}finally{__CLR3_1_121m1mhwlku4pc.R.flushNeeded();}}
	
	public void addEmployee(Employee e){try{__CLR3_1_121m1mhwlku4pc.R.inc(69);
		__CLR3_1_121m1mhwlku4pc.R.inc(70);System.out.println("code= "+e.getCode());
		__CLR3_1_121m1mhwlku4pc.R.inc(71);System.out.println("name= "+e.getName());
		__CLR3_1_121m1mhwlku4pc.R.inc(72);System.out.println("city= "+e.getCity());
		__CLR3_1_121m1mhwlku4pc.R.inc(73);employeeList.add(e);
		__CLR3_1_121m1mhwlku4pc.R.inc(74);System.out.println("count = "+employeeList.size());
	}finally{__CLR3_1_121m1mhwlku4pc.R.flushNeeded();}}
	
	public boolean deleteEmployee(int code)
	{try{__CLR3_1_121m1mhwlku4pc.R.inc(75);
		__CLR3_1_121m1mhwlku4pc.R.inc(76);boolean flag = false;
		__CLR3_1_121m1mhwlku4pc.R.inc(77);Iterator<Employee> itr = employeeList.iterator();
		__CLR3_1_121m1mhwlku4pc.R.inc(78);while((((itr.hasNext())&&(__CLR3_1_121m1mhwlku4pc.R.iget(79)!=0|true))||(__CLR3_1_121m1mhwlku4pc.R.iget(80)==0&false)))
		{{
			__CLR3_1_121m1mhwlku4pc.R.inc(81);Employee emp = itr.next();
			__CLR3_1_121m1mhwlku4pc.R.inc(82);if((((emp.getCode() == code)&&(__CLR3_1_121m1mhwlku4pc.R.iget(83)!=0|true))||(__CLR3_1_121m1mhwlku4pc.R.iget(84)==0&false)))
			{{
				__CLR3_1_121m1mhwlku4pc.R.inc(85);itr.remove();
				__CLR3_1_121m1mhwlku4pc.R.inc(86);flag = true;
			}
		}}
		}__CLR3_1_121m1mhwlku4pc.R.inc(87);return flag;
	}finally{__CLR3_1_121m1mhwlku4pc.R.flushNeeded();}}
	
	public boolean editEmployee(Employee e)
	{try{__CLR3_1_121m1mhwlku4pc.R.inc(88);
		__CLR3_1_121m1mhwlku4pc.R.inc(89);boolean flag = false;
		__CLR3_1_121m1mhwlku4pc.R.inc(90);flag=deleteEmployee(e.getCode());
		__CLR3_1_121m1mhwlku4pc.R.inc(91);if((((flag)&&(__CLR3_1_121m1mhwlku4pc.R.iget(92)!=0|true))||(__CLR3_1_121m1mhwlku4pc.R.iget(93)==0&false))){{
		__CLR3_1_121m1mhwlku4pc.R.inc(94);employeeList.add(e);
		}
		}__CLR3_1_121m1mhwlku4pc.R.inc(95);return flag;
	}finally{__CLR3_1_121m1mhwlku4pc.R.flushNeeded();}}
}
