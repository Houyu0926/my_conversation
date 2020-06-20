package client;

import java.util.Hashtable;

public class SystemRegistry {
    private static Hashtable<String,Object> sysReg;

    public static Hashtable<String, Object> getSysReg() {
        if(sysReg == null){
            sysReg = new Hashtable<String, Object>();
        }
        return sysReg;
    }

    public static void setSysReg(Hashtable<String, Object> sysReg) {
        SystemRegistry.sysReg = sysReg;
    }
}
