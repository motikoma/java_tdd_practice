package immutable.party;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Party {
    static final int MAX_PARTY_SIZE = 5;
    private final List<Member> members;

    private Party(final List<Member> members) {
        this.members = members;
    }

    Party add(final Member newMember) {
        if(exists(newMember)) {
            throw new IllegalArgumentException("Member already exists in party");
        }
        if(isFull()) {
            throw new IllegalStateException("Party is full");
        }

        final List<Member> newMembers = new ArrayList<>(members);
        newMembers.add(newMember);
        return new Party(newMembers);
    }

    List<Member> members(){
        return members.stream().collect(Collectors.toUnmodifiableList());
    }

    boolean isAlive(){
        return members.stream().anyMatch(each -> each.isAlive());
    }

    private boolean isFull() {
        return members.size() == MAX_PARTY_SIZE;
    }

    private boolean exists(final Member newMember) {
        return members.stream().anyMatch(each -> each.id == newMember.id);
    }
}
