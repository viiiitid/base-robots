package gui;

import org.junit.jupiter.api.Test;
import javax.swing.*;
import java.util.Locale;
import static org.junit.jupiter.api.Assertions.*;

public class RobotsProgramTest {

    @Test
    public void testRussianLocale() {
        RussianLocalizer localizer = new RussianLocalizer();
        localizer.apply();

        assertEquals("ru", Locale.getDefault().getLanguage());
        assertEquals("Да", UIManager.getString("OptionPane.yesButtonText"));
        assertEquals("Нет", UIManager.getString("OptionPane.noButtonText"));
        assertEquals("Отмена", UIManager.getString("OptionPane.cancelButtonText"));
    }
}