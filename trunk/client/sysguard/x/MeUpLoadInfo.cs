using System;
using System.Collections.Generic;
using System.Text;
using System.IO;
namespace sysguard.x
{
    class MeUpLoadInfo
    {
        private string removePath;
        public string RemovePath {
            set {
                this.removePath = value;
            }
            get {
                return removePath;
            }
        }

        private List<FileInfo> fileInfos=new List<FileInfo>();
        public List<FileInfo> FileInfos
        {
            set {
                fileInfos = value;
            }
            get {
                return fileInfos;
            }
        }
    }
}
