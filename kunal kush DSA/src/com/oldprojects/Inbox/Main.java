package com.oldprojects.Inbox;

import com.oldprojects.gmail.Drafts.Delete_Draft;
import com.oldprojects.gmail.Drafts.Draft;

public class Main {

    public static void main(String[] args)
    {
        Inbox a1 = new Inbox();
        Delete a2 = new Delete();

        a1.recevemail();
        a2.delete();

        Draft a3 = new Draft();
        Delete_Draft a4 = new Delete_Draft();

        a3.draftmessage();
        a4.deletedraftmessage();

    }
}