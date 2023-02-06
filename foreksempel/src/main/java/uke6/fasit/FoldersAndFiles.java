package uke6.fasit;

import java.util.ArrayList;
import java.util.Collection;


public class FoldersAndFiles {
    Collection<Object> ff = new ArrayList<>();


    public void addFile(File file) {
        ff.add(file);
    }

    public void addFolder(Folder folder) {
        ff.add(folder);
    }

    public Object findFirstHit(String pattern) {
        for (Object object : ff) {
            System.out.println("Sjekker "+object);
            if (object.toString().contains(pattern)) {
                System.out.println(object);
                return object;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        FoldersAndFiles faf = new FoldersAndFiles();
        Folder home = new Folder("home", null);
        faf.addFolder(new Folder("borgeh", home));
        faf.addFile(new File("fil.txt", home));
        faf.addFile(new File("fil2.txt", home));
        faf.addFile(new File("fil3.txt", home));
        System.out.println(faf.findFirstHit("3"));
        Object hit = faf.findFirstHit("bor");
        System.out.println(hit.getClass());
        Folder myFolder = (Folder) hit;
    }
}
