package mail;

public class EmailMain {
	public static void main(String[] args) {
		String to = "dudgh9407@naver.com";
		String subject = "�ݰ����ϴ�.";
		String content = "������ ���ϵ帳�ϴ�.";
		SMTPAuthenticator smtp = new SMTPAuthenticator();
		Mailer mailer = new Mailer();
		mailer.sendMail(to, subject, content, smtp);
	}
}