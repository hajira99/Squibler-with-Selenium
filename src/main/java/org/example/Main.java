package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

      Squibler_Register register = new Squibler_Register();
      register.Signup();

        Squibler_Login login = new Squibler_Login();
        login.Signin();

        Create_Document CD = new Create_Document();
        CD.CreateBiography();

        Edit_Document ED = new Edit_Document();
        ED.Edit();

        Delete_Document Del = new Delete_Document();
        Del.Delete();

        Export_Document Expo = new Export_Document();
        Expo.Export();


    }

}