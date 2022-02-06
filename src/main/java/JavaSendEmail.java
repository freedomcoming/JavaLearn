import javax.mail.*;
import java.util.*;
import javax.mail.internet.*;

public class JavaSendEmail {
    public static void main(String[] args) throws Exception {
        //1.配置发送邮件的属性
        Properties properties = new Properties();
        properties.setProperty("mail.smtp.host", "smtp.yeah.net"); //设置协议主机
        properties.setProperty("mail.smtp.auth", "true"); //设置smtp是否需要认证
        properties.setProperty("mail.smtp.ssl.enable", "true");


        //2.根据属性获得一个会话
        Session session = Session.getInstance(properties);
        //3.设置会话是debug模式(会打印更多相关信息)
        session.setDebug(true);
        //4.创建邮件主题信息对象
        MimeMessage message = new MimeMessage(session);
        //5.设置发件人
        message.setFrom(new InternetAddress("wxw866@yeah.net"));
        //6.设置邮件主题
        message.setSubject("我的第一份java邮件");
        //7.设置邮件正文
        message.setText("第一份邮件发送成功了,哈哈");
        //8.设置收件人: TO-发送    CC-抄送   BCC-密送
        message.setRecipient(Message.RecipientType.TO, new InternetAddress("824987775@qq.com"));
        //9.获取发送器对象:提供指定的协议
        Transport transport = session.getTransport("smtp");
        //10.设置发件人的信息
        transport.connect("wxw866@yeah.net", "FZGDKEQHCXFKUYQU");
        //11.发送邮件
        transport.sendMessage(message, message.getAllRecipients());
        //12.关闭资源
        transport.close();
    }
}