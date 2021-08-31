using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Forms
{
    class Usuario
    {

        public bool Login(string login, string senha)
        {
            bool ret = false;

            string strConexao = "";
            string Query = "Login ='" + login + "'AND Senha = '" + senha + "' AND Status = '1'; ";

            ret = true;

            return ret;
        }

    }
}
