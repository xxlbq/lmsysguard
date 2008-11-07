using System;
using System.Collections.Generic;
using System.Text;
using NUnit.Framework;
namespace Sysguard.BackgroundManage
{
    [TestFixture]
    public class TestVerify
    {


        [SetUp]
        protected void SetUp()
        {
            System.Console.WriteLine("SetUp invoke");

        }
        [Test]
        public void IsNULL()
        {
           
            string str = "";
           
            Assert.IsTrue(VerifyUtil.IsEmpty(str));
           

        }
        [Test]
        public void IsNumber()
        {

            Assert.IsTrue(VerifyUtil.IsNumber("5"));
            Assert.IsFalse(VerifyUtil.IsNumber("a"));
            Assert.IsFalse(VerifyUtil.IsNumber("ab"));

        }
        [Test]
        public void IsAlpha()
        {
            Assert.IsTrue(VerifyUtil.IsAlpha("a"));
            Assert.IsTrue(VerifyUtil.IsAlpha("Z"));
            Assert.IsFalse(VerifyUtil.IsAlpha("["));
        }
        [Test]
        public void VerifyInput()
        {
            string str = "1324asdf%%$";
            string str1 = "as_djf";
            string str2 = "asd-jf";
            string str3 = "asd+";
            Assert.IsFalse(VerifyUtil.VerifyInput(str));
            Assert.IsTrue(VerifyUtil.VerifyInput(str1));
            Assert.IsTrue(VerifyUtil.VerifyInput(str2));
            Assert.IsFalse(VerifyUtil.VerifyInput(str3));
        }

        [Test]
        public void VerifyName() {

            string name = "ÄãºÃÂðÄãºÃÂð";
           
            Assert.IsFalse(VerifyUtil.VerifyName(name));
        }


    }
}
