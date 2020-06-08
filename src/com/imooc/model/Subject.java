package com.imooc.model;

public class Subject {
    private String subjectName;
    private String subjectNo;
    private int subjectLife;

    public Subject() {}

    // 带参构造，实现对属性的全部赋值
    public Subject( String subjectName, String subjectNo, int subjectLife) {
//        this.subjectName = subjectName;
        this.setSubjectName(subjectName); // 安全高
        this.setSubjectLife(subjectLife);
        this.setSubjectNo(subjectNo);
    }

    public int getSubjectLife() {
        return subjectLife;
    }

    public void setSubjectLife(int subjectLife) {
        if(subjectLife <= 0)
            return;
        this.subjectLife = subjectLife;
    }


    public String getSubjectNo() {
        return subjectNo;
    }

    public void setSubjectNo(String subjectNo) {
        this.subjectNo = subjectNo;
    }


    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    /*
    *专业介绍的方法
    * @return 专业介绍相关内容
    *
    * */
    public String info() {
        String str = "专业信息如下： \n专业名称：" + this.getSubjectName()  + "\n专业编号：" + this.getSubjectNo() +  "\n学制年限：：" +this.subjectLife +"年"  ;
        return str;
    }
}
