package com.ua.learning.project.implementation.submit_registration;
import com.ua.learning.project.implementation.BaseTest;
import com.ua.learning.project.model.entity.RegistrationForm;
import com.ua.learning.project.model.pages.ui.implementation.menu.AbcMenu;
import com.ua.learning.project.model.pages.ui.implementation.menu.CDIMenu;
import com.ua.learning.project.model.pages.ui.implementation.menu.MainMenu;
import com.ua.learning.project.model.pages.ui.implementation.login.LoginPage;
import com.ua.learning.project.utils.test_constants.TestConstants;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;

import static com.ua.learning.project.utils.test_constants.TestConstants.*;

public class SubmitRegistrationTest extends BaseTest {
    @Test
    public void loginSystem() {
        LoginPage loginPage = new LoginPage("http://www.google.com.ua");
        loginPage.openWindow();
    }

    @Test
    public void checkThatAllMenuSelected() {
        MainMenu mainmenu = new MainMenu();
        mainmenu.selectMenu();
        AbcMenu abcmenu = new AbcMenu();
        abcmenu.selectMenu();
        CDIMenu cdimenu = new CDIMenu();
        cdimenu.selectMenu();
    }

    @Test
    public void checkThatABCMenuSelected() {
        AbcMenu abcmenu = new AbcMenu();
        abcmenu.selectMenu();
    }

    @Test
    public void testRegistrationForm() {
        RegistrationForm regForm = new RegistrationForm();
        System.out.println(regForm);
    }

    @Test
    public void testRegistrationFormConstants() {
        RegistrationForm regForm = new RegistrationForm(firstname, lastname, birthday, age);
        System.out.println(regForm);
    }

    @Test
    public void testRegistrationFormHash() {
        RegistrationForm regForm = new RegistrationForm("Petrov");
        System.out.println(regForm);
        System.out.println("Hash Code: " + regForm.hashCode());
    }

    // Task 4
    @Test
    public void task4() {
        String result[] = {"aa", "bb", "cc"};
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < result.length; i++) {
            sb.append(result[i]);
        }
        String str = sb.toString();
        System.out.println(str);
    }

    // Task 5

    @Test
    public void task5() {
        String str = "abracadabrfdfdfaaaa";
        int vowelcount = 0;
        char[] chars = str.toCharArray();
        for (char c : chars) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowelcount++;
            }
        }
        System.out.println("vowels  count : " + vowelcount);
    }

    // Task 6
    @Test
    public void task6()
    {
        int a[] = { 1, 2 };
        int b[] = { 2 };

        int n = a.length;
        int m = b.length;

        for (int i = 0; i < n; i++)
        {
            int j;

            for (j = 0; j < m; j++)
                if (a[i] == b[j])
                    break;

            if (j == m)
                System.out.print(a[i] + " ");
        }
    }
}