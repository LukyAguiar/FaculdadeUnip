using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Forms
{
    public partial class FrmLogin : Form
    {
        public FrmLogin()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            Usuario usu = new Usuario();
            String Login = "";
            String Senha = "";

            if (usu.Login(Login, Senha))
            {
                FrmPrincipal JanelaPrincipal = new FrmPrincipal();
                FrmPrincipal.Show;
            }
            else
            {
                MessageBox.Show("Dados Invalidos","Aviso", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
            
        }
    }
}
