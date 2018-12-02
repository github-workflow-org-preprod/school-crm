/*
 * This file is generated by jOOQ.
 */
package org.ort.school.crm.jooq.model;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Sequence;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;
import org.ort.school.crm.jooq.model.tables.Grade;
import org.ort.school.crm.jooq.model.tables.Group;
import org.ort.school.crm.jooq.model.tables.GroupStudent;
import org.ort.school.crm.jooq.model.tables.Parent;
import org.ort.school.crm.jooq.model.tables.ParentStudent;
import org.ort.school.crm.jooq.model.tables.Role;
import org.ort.school.crm.jooq.model.tables.Student;
import org.ort.school.crm.jooq.model.tables.User;
import org.ort.school.crm.jooq.model.tables.UserRole;


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
public class Public extends SchemaImpl {

    private static final long serialVersionUID = -1795836595;

    /**
     * The reference instance of <code>public</code>
     */
    public static final Public PUBLIC = new Public();

    /**
     * The table <code>public.grade</code>.
     */
    public final Grade GRADE = org.ort.school.crm.jooq.model.tables.Grade.GRADE;

    /**
     * The table <code>public.group</code>.
     */
    public final Group GROUP = org.ort.school.crm.jooq.model.tables.Group.GROUP;

    /**
     * The table <code>public.group_student</code>.
     */
    public final GroupStudent GROUP_STUDENT = org.ort.school.crm.jooq.model.tables.GroupStudent.GROUP_STUDENT;

    /**
     * The table <code>public.parent</code>.
     */
    public final Parent PARENT = org.ort.school.crm.jooq.model.tables.Parent.PARENT;

    /**
     * The table <code>public.parent_student</code>.
     */
    public final ParentStudent PARENT_STUDENT = org.ort.school.crm.jooq.model.tables.ParentStudent.PARENT_STUDENT;

    /**
     * The table <code>public.role</code>.
     */
    public final Role ROLE = org.ort.school.crm.jooq.model.tables.Role.ROLE;

    /**
     * The table <code>public.student</code>.
     */
    public final Student STUDENT = org.ort.school.crm.jooq.model.tables.Student.STUDENT;

    /**
     * The table <code>public.user</code>.
     */
    public final User USER = org.ort.school.crm.jooq.model.tables.User.USER;

    /**
     * The table <code>public.user_role</code>.
     */
    public final UserRole USER_ROLE = org.ort.school.crm.jooq.model.tables.UserRole.USER_ROLE;

    /**
     * No further instances allowed
     */
    private Public() {
        super("public", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Sequence<?>> getSequences() {
        List result = new ArrayList();
        result.addAll(getSequences0());
        return result;
    }

    private final List<Sequence<?>> getSequences0() {
        return Arrays.<Sequence<?>>asList(
            Sequences.GRADE_ID_SEQ,
            Sequences.GROUP_ID_SEQ,
            Sequences.PARENT_ID_SEQ,
            Sequences.STUDENT_ID_SEQ,
            Sequences.USER_ID_SEQ);
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            Grade.GRADE,
            Group.GROUP,
            GroupStudent.GROUP_STUDENT,
            Parent.PARENT,
            ParentStudent.PARENT_STUDENT,
            Role.ROLE,
            Student.STUDENT,
            User.USER,
            UserRole.USER_ROLE);
    }
}
