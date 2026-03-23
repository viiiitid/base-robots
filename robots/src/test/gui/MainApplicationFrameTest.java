package gui;

import org.junit.jupiter.api.Test;
import javax.swing.*;
import static org.junit.jupiter.api.Assertions.*;

public class MainApplicationFrameTest {

    @Test
    public void testExitMenuItemExists() {
        MainApplicationFrame frame = new MainApplicationFrame();
        JMenuBar menuBar = frame.getJMenuBar();

        assertNotNull(menuBar, "Menu bar should not be null");

        // Ищем меню "Файл"
        JMenu fileMenu = null;
        for (int i = 0; i < menuBar.getMenuCount(); i++) {
            JMenu menu = menuBar.getMenu(i);
            if (menu != null && menu.getText().equals("Файл")) {
                fileMenu = menu;
                break;
            }
        }

        assertNotNull(fileMenu, "File menu should exist");

        // Ищем пункт "Выход"
        boolean exitFound = false;
        for (int i = 0; i < fileMenu.getItemCount(); i++) {
            JMenuItem item = fileMenu.getItem(i);
            if (item != null && item.getText().equals("Выход")) {
                exitFound = true;
                break;
            }
        }

        assertTrue(exitFound, "Exit menu item should exist");
    }
}