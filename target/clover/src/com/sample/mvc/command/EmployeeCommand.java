/* $$ This file has been instrumented by Clover 3.1.12#20130627143542579 $$ */package com.sample.mvc.command;

public class EmployeeCommand {public static class __CLR3_1_1200hwlku4mb{public static com_cenqua_clover.CoverageRecorder R;public static com_cenqua_clover.CloverProfile[] profiles = { };static{com_cenqua_clover.CoverageRecorder _R=null;try{com_cenqua_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___3_1_12();if(20130627143542579L!=com_cenqua_clover.CloverVersionInfo.getBuildStamp()){com_cenqua_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_cenqua_clover.Clover.l("[CLOVER] WARNING: Instr=3.1.12#20130627143542579,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum()+"#"+com_cenqua_clover.CloverVersionInfo.getBuildStamp());}R=com_cenqua_clover.Clover.getNullRecorder();_R=com_cenqua_clover.Clover.getNullRecorder();_R=com_cenqua_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0070\u0072\u0061\u006b\u0061\u0073\u0068\u0073\u0069\u006e\u0068\u0061\u0062\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1403152611990L,8589935092L,12,profiles,new String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}

	public int code;
	private String name;
	private String city; 
	
	public String getName() {try{__CLR3_1_1200hwlku4mb.R.inc(0);
		__CLR3_1_1200hwlku4mb.R.inc(1);return name;
	}finally{__CLR3_1_1200hwlku4mb.R.flushNeeded();}}

	public void setName(String name) {try{__CLR3_1_1200hwlku4mb.R.inc(2);
		__CLR3_1_1200hwlku4mb.R.inc(3);this.name = name;
	}finally{__CLR3_1_1200hwlku4mb.R.flushNeeded();}}

	public int getCode() {try{__CLR3_1_1200hwlku4mb.R.inc(4);
		__CLR3_1_1200hwlku4mb.R.inc(5);return code;
	}finally{__CLR3_1_1200hwlku4mb.R.flushNeeded();}}

	public void setCode(int code) {try{__CLR3_1_1200hwlku4mb.R.inc(6);
		__CLR3_1_1200hwlku4mb.R.inc(7);this.code = code;
	}finally{__CLR3_1_1200hwlku4mb.R.flushNeeded();}}

	public String getCity() {try{__CLR3_1_1200hwlku4mb.R.inc(8);
		__CLR3_1_1200hwlku4mb.R.inc(9);return city;
	}finally{__CLR3_1_1200hwlku4mb.R.flushNeeded();}}

	public void setCity(String city) {try{__CLR3_1_1200hwlku4mb.R.inc(10);
		__CLR3_1_1200hwlku4mb.R.inc(11);this.city = city;
	}finally{__CLR3_1_1200hwlku4mb.R.flushNeeded();}}

}
