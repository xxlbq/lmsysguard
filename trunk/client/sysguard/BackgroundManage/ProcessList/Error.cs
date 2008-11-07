using System;
using System.Collections.Generic;
using System.Text;

namespace Sysguard.BackgroundManage.ProcessList
{
   public class Error
    {
       
        private string code;

       public string CodeProperty
        {
            get { return code; }
            set { code = value; }
        }
	

        
        private string describe;

        public string DescribeProperty
        {
            get { return describe; }
            set { describe = value; }
        }
	

        

        private string handleProcess;

        public string HandleProcessProperty
        {
            get { return handleProcess; }
            set { handleProcess = value; }
        }

	
        private string confirmProcess;


        public string ConfirmProcessProperty
        {
            get { return confirmProcess; }
            set { confirmProcess = value; }
        }
	
        private string reason;

        public string ReasonProperty
        {
            get { return reason; }
            set { reason = value; }
        }
	
        private string resolveMethod;

        public string ResolveMethodProperty
        {
            get { return resolveMethod; }
            set { resolveMethod = value; }
        }

        public Object[] ToArray()
        {
            Object[] array = new object[6];

            array[0] = (Object)code;
            array[1] = (Object)describe;
            array[2] = (Object)handleProcess;
            array[3] = (Object)confirmProcess;
            array[4] = (Object)reason;
            array[5] = (Object)resolveMethod;
            return array;

        }
	

    }
}
