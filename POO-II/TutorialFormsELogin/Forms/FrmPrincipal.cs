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
    public partial class FrmPrincipal : Form
    {
        public FrmPrincipal()
        {
            InitializeComponent();
        }

        private void usuárioToolStripMenuItem_Click(object sender, EventArgs e)
        {
            //Formulario MDI pode ter outros formularios embutidos dentro dele - exemplo abaixo
            FrmCadastroUsuario JanCadUsuario = new FrmCadastroUsuario();
            JanCadUsuario.MdiParent = this;
            JanCadUsuario.Show();
        }

        private void hóspedesToolStripMenuItem_Click(object sender, EventArgs e)
        {
            //Formulario SDI
            FrmCadastroHospedes JanCadHospede = new FrmCadastroHospedes();
            JanCadHospede.MdiParent = this;
            JanCadHospede.Show();
        }

        private void relatórioToolStripMenuItem_Click(object sender, EventArgs e)
        {
            FrmRelatorios JanRelatorios = new FrmRelatorios();
            JanRelatorios.Show();
        }
    }
}
