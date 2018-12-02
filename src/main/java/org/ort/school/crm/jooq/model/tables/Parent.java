/*
 * This file is generated by jOOQ.
 */
package org.ort.school.crm.jooq.model.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
import org.ort.school.crm.jooq.model.Indexes;
import org.ort.school.crm.jooq.model.Keys;
import org.ort.school.crm.jooq.model.Public;
import org.ort.school.crm.jooq.model.tables.records.ParentRecord;


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
public class Parent extends TableImpl<ParentRecord> {

    private static final long serialVersionUID = -2041355601;

    /**
     * The reference instance of <code>public.parent</code>
     */
    public static final Parent PARENT = new Parent();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ParentRecord> getRecordType() {
        return ParentRecord.class;
    }

    /**
     * The column <code>public.parent.id</code>.
     */
    public final TableField<ParentRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('parent_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>public.parent.lastname</code>.
     */
    public final TableField<ParentRecord, String> LASTNAME = createField("lastname", org.jooq.impl.SQLDataType.VARCHAR(300).nullable(false), this, "");

    /**
     * The column <code>public.parent.firstname</code>.
     */
    public final TableField<ParentRecord, String> FIRSTNAME = createField("firstname", org.jooq.impl.SQLDataType.VARCHAR(300).nullable(false), this, "");

    /**
     * The column <code>public.parent.email</code>.
     */
    public final TableField<ParentRecord, String> EMAIL = createField("email", org.jooq.impl.SQLDataType.VARCHAR(300).nullable(false), this, "");

    /**
     * The column <code>public.parent.patronymic</code>.
     */
    public final TableField<ParentRecord, String> PATRONYMIC = createField("patronymic", org.jooq.impl.SQLDataType.VARCHAR(300), this, "");

    /**
     * Create a <code>public.parent</code> table reference
     */
    public Parent() {
        this(DSL.name("parent"), null);
    }

    /**
     * Create an aliased <code>public.parent</code> table reference
     */
    public Parent(String alias) {
        this(DSL.name(alias), PARENT);
    }

    /**
     * Create an aliased <code>public.parent</code> table reference
     */
    public Parent(Name alias) {
        this(alias, PARENT);
    }

    private Parent(Name alias, Table<ParentRecord> aliased) {
        this(alias, aliased, null);
    }

    private Parent(Name alias, Table<ParentRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Parent(Table<O> child, ForeignKey<O, ParentRecord> key) {
        super(child, key, PARENT);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.PARENT_EMAIL_KEY, Indexes.PARENT_LASTNAME_FIRSTNAME_EMAIL_PATRONYMIC_KEY, Indexes.PARENT_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<ParentRecord, Long> getIdentity() {
        return Keys.IDENTITY_PARENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ParentRecord> getPrimaryKey() {
        return Keys.PARENT_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ParentRecord>> getKeys() {
        return Arrays.<UniqueKey<ParentRecord>>asList(Keys.PARENT_PKEY, Keys.PARENT_LASTNAME_FIRSTNAME_EMAIL_PATRONYMIC_KEY, Keys.PARENT_EMAIL_KEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Parent as(String alias) {
        return new Parent(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Parent as(Name alias) {
        return new Parent(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Parent rename(String name) {
        return new Parent(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Parent rename(Name name) {
        return new Parent(name, null);
    }
}
