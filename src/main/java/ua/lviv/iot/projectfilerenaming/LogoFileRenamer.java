package ua.lviv.iot.ProjectFileRenaming;

import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class LogoFileRenamer {

    public List<String> findBySequenceOfNumbersAndRename(String files, String searchedSequence) {
        LinkedList<String> logoFiles = new LinkedList<>();
        Pattern pt = Pattern.compile("logo[^\s]*" + searchedSequence + "[^\s]*[.][^;]+");
        Matcher mt = pt.matcher(files);

        while (mt.find()) {
            logoFiles.add(mt.group().replaceAll("logo", "LOGO_"));
        }
        return logoFiles;
    }
}
