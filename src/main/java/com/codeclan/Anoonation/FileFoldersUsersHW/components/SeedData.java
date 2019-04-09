package com.codeclan.Anoonation.FileFoldersUsersHW.components;

import com.codeclan.Anoonation.FileFoldersUsersHW.Models.File;
import com.codeclan.Anoonation.FileFoldersUsersHW.Models.Folder;
import com.codeclan.Anoonation.FileFoldersUsersHW.Models.User;
import com.codeclan.Anoonation.FileFoldersUsersHW.Repositories.FileRepository;
import com.codeclan.Anoonation.FileFoldersUsersHW.Repositories.FolderRepository;
import com.codeclan.Anoonation.FileFoldersUsersHW.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SeedData implements ApplicationRunner {
    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    public void run(ApplicationArguments args){
        User user = new User("Kira");
        userRepository.save(user);

        Folder folder = new Folder("AAA", user);
        folderRepository.save(folder);

        File file = new File("aaa", "JP", 122, folder);
        fileRepository.save(file);

    }

}
