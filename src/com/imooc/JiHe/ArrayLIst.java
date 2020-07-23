package com.imooc.JiHe;

import com.sun.org.apache.xpath.internal.objects.XString;

import java.util.ArrayList;
import java.util.Date;

public class ArrayLIst {

  public static void main(String[] args) {
    // 创建Notice类的对象, 生成公告
    Notice notice1 = new Notice(1, "欢迎来到1", "管理员", new Date());
    Notice notice2 = new Notice(1, "欢迎来到2", "管理员1", new Date());
    Notice notice3 = new Notice(1, "欢迎来到3", "管理员2", new Date());
    Notice notice4 = new Notice(1, "欢迎来到4", "管理员3", new Date());

    // 添加公告
    ArrayList noticeList = new ArrayList();
    noticeList.add(notice1);
    noticeList.add(notice2);
    noticeList.add(notice3);
    noticeList.add(notice4);

    // 显示公告
    System.out.println("=========================");
    for (int i = 0; i < noticeList.size(); i++) {
      // 要向下转型才能有getTitle方法
      System.out.println( i + 1 + ":" +  ((Notice)(noticeList.get(i))).getTitle());
    }

    //在第一条公告后面添加一条新公告
    Notice notice5 = new Notice(4, "在线编辑器可以用了", "小行", new Date());
    noticeList.add(1, notice5); // add(index , content)

    // 删除公告
    noticeList.remove(2);

    // 将第4条公告 改为 : 你变成新公告了
    notice4.setTitle("你变成新公告了");
//    noticeList.set(3, notice4); 如果需要用新对象来替换才使用这个

    // 显示公告
    System.out.println("=========================");
    for (int i = 0; i < noticeList.size(); i++) {
      // 要向下转型才能有getTitle方法
      System.out.println( i + 1 + ":" +  ((Notice)(noticeList.get(i))).getTitle());
    }
  }


  public static class Notice {
    private int id;
    private String title;
    private String creator;
    private Date createTime;
    public Notice(int id, String title, String creator, Date createTime) {
      super();
      this.id = id;
      this.title = title;
      this.creator = creator;
      this.createTime = createTime;
    }

    public int getId() {
      return id;
    }

    public void setId(int id) {
      this.id = id;
    }

    public Date getCreateTime() {
      return createTime;
    }

    public String getCreator() {
      return creator;
    }

    public String getTitle() {
      return title;
    }

    public void setCreateTime(Date createTime) {
      this.createTime = createTime;
    }

    public void setCreator(String creator) {
      this.creator = creator;
    }

    public void setTitle(String title) {
      this.title = title;
    }
  }
}


