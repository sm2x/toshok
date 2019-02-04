package kg.enesai.toshok.services

import kg.enesai.toshok.domains.Account
import kg.enesai.toshok.domains.Region
import kg.enesai.toshok.domains.Role
import kg.enesai.toshok.domains.User
import kg.enesai.toshok.dtos.*
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable

interface RegionService {
    fun findAll(): List<RegionDto>
    fun get(id: Int): Region
    fun findByName(name: String?): Region?
}

interface AccountService {
    fun findAll(): List<AccountDto>
    fun findAll(pageable: Pageable): Page<AccountDto>
    fun get(id: Int): Account
    fun create(account: Account): Account
    fun create(accountCreateForm: AccountCreateForm): Account
    fun update(form: AccountUpdateForm): Account
    fun delete(id: Int)
    fun getUpdateForm(id: Int): AccountUpdateForm
    fun findByFullname(fullname: String?): Account?
    fun saveAll(list: List<Account>)
    fun getLevel(account: Account): Int
    fun createAndFlush(it: Account): Account
    fun findAllPending(pageable: Pageable): Page<AccountDto>
    fun approve(id: Int)
}

interface RoleService {
    fun findByName(name: String): Role?
}

interface UserService {
    fun findByUsername(username: String): User?
    fun createMemberUser(username: String, password: String): User
}