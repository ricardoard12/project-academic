import javax.swing.JOptionPane;

import org.hibernate.Session;

import com.project.sistema.HibernateUtil;


public class Conecta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Session sessao = null;
		try{
			sessao = HibernateUtil.getSession().openSession();
			JOptionPane.showMessageDialog(null, "Conexao efetuada com sucesso");
		}finally{
			sessao.close();
			JOptionPane.showMessageDialog(null, "Conexao fechada com sucesso");
		}
	}

}
