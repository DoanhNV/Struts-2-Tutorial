package com.comparator;

import java.util.Comparator;

import com.model.User;

public class AgeComparator  implements Comparator<User>{

    public int compare(User o1, User o2) {
	return o1.getAge() - o2.getAge();
    }

}
