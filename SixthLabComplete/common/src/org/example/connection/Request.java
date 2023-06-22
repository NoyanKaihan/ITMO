package org.example.connection;

import org.example.modules.StudyGroup;

import java.io.Serializable;

public interface Request extends Serializable {
    String getCommandName();
    String getCommandArgument();
    void setArgument(String argument);
    StudyGroup getStudyGroupObject();
}
