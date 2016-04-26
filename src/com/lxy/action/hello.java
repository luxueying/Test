package com.lxy.action;
/**
 * 通过一个对象获得完整的包名和类名
 * */
public class hello{
    public static void main(String[] args) {
    	Class<?> demo=null;
        try{
            demo=Class.forName("com.lxy.action.persion");
        }catch (Exception e) {
            e.printStackTrace();
        }
        persion per=null;
        try {
            per=(persion)demo.newInstance();
        } catch (InstantiationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        per.setName("Rollen");
        per.setAge(20);
        System.out.println(per);
    }
    }

