package seg3102

import grails.transaction.Transactional

@Transactional
class UserService {

    def deactivateAccount(String userName) {

        try {
            User user = User.findByUserName(userName)
            user.deleted = true
        } catch (Exception e) {

        }
    }
}
