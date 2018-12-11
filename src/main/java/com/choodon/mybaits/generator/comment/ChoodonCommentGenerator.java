package com.choodon.mybaits.generator.comment;

import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.*;
import org.mybatis.generator.api.dom.xml.XmlElement;
import org.mybatis.generator.internal.DefaultCommentGenerator;
import org.mybatis.generator.internal.util.StringUtility;

import java.util.Properties;

/**
 * ChoodonCommentGenerator
 *
 * @author michael
 * @since 2018-12-08
 */
public class ChoodonCommentGenerator extends DefaultCommentGenerator {
    @Override
    public void addConfigurationProperties(Properties properties) {

    }

    @Override
    public void addFieldComment(Field field,
                                IntrospectedTable introspectedTable,
                                IntrospectedColumn introspectedColumn) {


        field.addJavaDocLine("/**"); //$NON-NLS-1$

        String remarks = introspectedColumn.getRemarks();
        if (StringUtility.stringHasValue(remarks)) {
            field.addJavaDocLine(" * Database Column Remarks:"); //$NON-NLS-1$
            String[] remarkLines = remarks.split(System.getProperty("line.separator"));  //$NON-NLS-1$
            for (String remarkLine : remarkLines) {
                field.addJavaDocLine(" * " + remarkLine);  //$NON-NLS-1$
            }
        }
        field.addJavaDocLine(" *"); //$NON-NLS-1$

        StringBuilder sb = new StringBuilder();
        sb.append(" * This field corresponds to the database column: "); //$NON-NLS-1$
        sb.append(introspectedTable.getFullyQualifiedTable());
        sb.append('.');
        sb.append(introspectedColumn.getActualColumnName());
        field.addJavaDocLine(sb.toString());

        field.addJavaDocLine(" */"); //$NON-NLS-1$
    }

    @Override
    public void addFieldComment(Field field, IntrospectedTable introspectedTable) {

    }

    @Override
    public void addModelClassComment(TopLevelClass topLevelClass,
                                     IntrospectedTable introspectedTable) {


        topLevelClass.addJavaDocLine("/**"); //$NON-NLS-1$

        String remarks = introspectedTable.getRemarks();
        if (StringUtility.stringHasValue(remarks)) {
            topLevelClass.addJavaDocLine(" * Database Table Remarks:"); //$NON-NLS-1$
            String[] remarkLines = remarks.split(System.getProperty("line.separator"));  //$NON-NLS-1$
            for (String remarkLine : remarkLines) {
                topLevelClass.addJavaDocLine(" * " + remarkLine);  //$NON-NLS-1$
            }
        }

        topLevelClass.addJavaDocLine(" *"); //$NON-NLS-1$

        StringBuilder sb = new StringBuilder();
        sb.append(" * This class corresponds to the database table:"); //$NON-NLS-1$
        sb.append(introspectedTable.getFullyQualifiedTable());
        topLevelClass.addJavaDocLine(sb.toString());

        topLevelClass
                .addJavaDocLine(" * @author MyBatis Generator."); //$NON-NLS-1$


        topLevelClass.addJavaDocLine(" */"); //$NON-NLS-1$
    }

    @Override
    public void addClassComment(InnerClass innerClass, IntrospectedTable introspectedTable) {

    }

    @Override
    public void addClassComment(InnerClass innerClass, IntrospectedTable introspectedTable, boolean markAsDoNotDelete) {

    }

    @Override
    public void addEnumComment(InnerEnum innerEnum, IntrospectedTable introspectedTable) {

    }

    @Override
    public void addGetterComment(Method method, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn) {

    }

    @Override
    public void addSetterComment(Method method, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn) {

    }

    @Override
    public void addGeneralMethodComment(Method method, IntrospectedTable introspectedTable) {

    }

    @Override
    public void addJavaFileComment(CompilationUnit compilationUnit) {

    }

    @Override
    public void addComment(XmlElement xmlElement) {

    }

    @Override
    public void addRootComment(XmlElement rootElement) {

    }
}
