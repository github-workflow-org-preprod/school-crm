/*
 * This file is generated by jOOQ.
 */
package org.ort.school.crm.jooq.model.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;
import org.ort.school.crm.jooq.model.tables.User;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserRecord extends UpdatableRecordImpl<UserRecord> implements Record7<Long, String, String, String, String, String, String> {

    private static final long serialVersionUID = -1103588714;

    /**
     * Setter for <code>public.user.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.user.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.user.username</code>.
     */
    public void setUsername(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.user.username</code>.
     */
    public String getUsername() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.user.password</code>.
     */
    public void setPassword(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.user.password</code>.
     */
    public String getPassword() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.user.email</code>.
     */
    public void setEmail(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.user.email</code>.
     */
    public String getEmail() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.user.firstname</code>.
     */
    public void setFirstname(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.user.firstname</code>.
     */
    public String getFirstname() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.user.lastname</code>.
     */
    public void setLastname(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.user.lastname</code>.
     */
    public String getLastname() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.user.patronymic</code>.
     */
    public void setPatronymic(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.user.patronymic</code>.
     */
    public String getPatronymic() {
        return (String) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Long, String, String, String, String, String, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Long, String, String, String, String, String, String> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return User.USER.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return User.USER.USERNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return User.USER.PASSWORD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return User.USER.EMAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return User.USER.FIRSTNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return User.USER.LASTNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return User.USER.PATRONYMIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getUsername();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getPassword();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getFirstname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getLastname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getPatronymic();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getUsername();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getPassword();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getFirstname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getLastname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getPatronymic();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value2(String value) {
        setUsername(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value3(String value) {
        setPassword(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value4(String value) {
        setEmail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value5(String value) {
        setFirstname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value6(String value) {
        setLastname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value7(String value) {
        setPatronymic(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord values(Long value1, String value2, String value3, String value4, String value5, String value6, String value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UserRecord
     */
    public UserRecord() {
        super(User.USER);
    }

    /**
     * Create a detached, initialised UserRecord
     */
    public UserRecord(Long id, String username, String password, String email, String firstname, String lastname, String patronymic) {
        super(User.USER);

        set(0, id);
        set(1, username);
        set(2, password);
        set(3, email);
        set(4, firstname);
        set(5, lastname);
        set(6, patronymic);
    }
}
