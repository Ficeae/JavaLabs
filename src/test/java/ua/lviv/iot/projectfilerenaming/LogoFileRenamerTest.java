package ua.lviv.iot.ProjectFileRenaming;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LogoFileRenamerTest {

    @Test
    void testFileRenaming() {
        String[] expectedResult = {"LOGO_MyLogo001.png", "LOGO_001Description.txt", "LOGO_Prototype001.jpg"};
        LogoFileRenamer fileRenamer = new LogoFileRenamer();
        List<String> filesList = fileRenamer.findBySequenceOfNumbersAndRename("logoMyLogo001.png; logoButNotFile; smth001.py; logo002.png; logo.jpeg; logo001Description.txt; logoPrototype001.jpg",
                "001");
        try {
            for (int currentElementOfList = 0; currentElementOfList < expectedResult.length; currentElementOfList++) {
                assertEquals(expectedResult[currentElementOfList], filesList.get(currentElementOfList));
                System.out.println(filesList.get(currentElementOfList));
            }
        } catch (Exception e) {
            System.out.println("Whoops, some error occurred");
        }
    }
}