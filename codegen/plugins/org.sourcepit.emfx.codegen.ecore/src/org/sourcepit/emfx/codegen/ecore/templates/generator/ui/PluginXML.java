package org.sourcepit.emfx.codegen.ecore.templates.generator.ui;

import org.eclipse.emf.codegen.ecore.genmodel.*;
import org.sourcepit.emfx.codegen.ecore.genmodel2.*;

public class PluginXML
{
  protected static String nl;
  public static synchronized PluginXML create(String lineSeparator)
  {
    nl = lineSeparator;
    PluginXML result = new PluginXML();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" + NL + "<?eclipse version=\"3.0\"?>" + NL;
  protected final String TEXT_2 = NL;
  protected final String TEXT_3 = "<!--";
  protected final String TEXT_4 = NL + " ";
  protected final String TEXT_5 = NL + " <copyright>" + NL + " </copyright>" + NL;
  protected final String TEXT_6 = NL + " ";
  protected final String TEXT_7 = "Id";
  protected final String TEXT_8 = NL + "-->" + NL;
  protected final String TEXT_9 = NL + "<plugin>";
  protected final String TEXT_10 = NL + "<plugin" + NL + "      name=\"%pluginName\"" + NL + "      id=\"";
  protected final String TEXT_11 = "\"" + NL + "      version=\"1.0.0\"" + NL + "      provider-name=\"%providerName\"" + NL + "      class=\"";
  protected final String TEXT_12 = "$Implementation\">" + NL + "" + NL + "   <requires>";
  protected final String TEXT_13 = NL + "      <import plugin=\"";
  protected final String TEXT_14 = "\"";
  protected final String TEXT_15 = " export=\"true\"";
  protected final String TEXT_16 = "/>";
  protected final String TEXT_17 = NL + "   </requires>" + NL + "" + NL + "   <runtime>";
  protected final String TEXT_18 = NL + "      <library name=\"";
  protected final String TEXT_19 = ".jar\">";
  protected final String TEXT_20 = NL + "      <library name=\".\">";
  protected final String TEXT_21 = NL + "         <export name=\"*\"/>" + NL + "      </library>" + NL + "   </runtime>";
  protected final String TEXT_22 = NL + "   <extension" + NL + "         point=\"org.eclipse.ui.commands\">" + NL + "      <category" + NL + "            id=\"";
  protected final String TEXT_23 = "\"" + NL + "            name=\"%_UI_GenerateCommandCategory_name\"" + NL + "            description=\"%_UI_GenerateCommandCategory_description\">" + NL + "      </category>";
  protected final String TEXT_24 = NL + "      <command" + NL + "            categoryId=\"";
  protected final String TEXT_25 = "\"" + NL + "            id=\"";
  protected final String TEXT_26 = "\"" + NL + "            name=\"%_UI_";
  protected final String TEXT_27 = "_GenerateCommand_name\">" + NL + "         <commandParameter" + NL + "               id=\"";
  protected final String TEXT_28 = "\"" + NL + "               name=\"%_UI_";
  protected final String TEXT_29 = "_GenerateCommand_ProjectTypesParameter_name\"" + NL + "               optional=\"false\">" + NL + "         </commandParameter>" + NL + "      </command>";
  protected final String TEXT_30 = NL + "   </extension>";
  protected final String TEXT_31 = NL + "   <extension" + NL + "         point=\"org.eclipse.ui.handlers\">" + NL + "      <handler" + NL + "            class=\"";
  protected final String TEXT_32 = "\"" + NL + "            commandId=\"";
  protected final String TEXT_33 = "\">" + NL + "      </handler>" + NL + "   </extension>   ";
  protected final String TEXT_34 = NL + "   <extension" + NL + "         point=\"org.eclipse.ui.menus\">" + NL + "      <menuContribution" + NL + "            allPopups=\"false\"" + NL + "            locationURI=\"popup:";
  protected final String TEXT_35 = "ID?before=additions\">";
  protected final String TEXT_36 = "             " + NL + "         <command" + NL + "               commandId=\"";
  protected final String TEXT_37 = "\"" + NL + "               icon=\"";
  protected final String TEXT_38 = "\"" + NL + "               label=\"Generate ";
  protected final String TEXT_39 = " ";
  protected final String TEXT_40 = "\"" + NL + "               style=\"push\">" + NL + "            <visibleWhen" + NL + "                  checkEnabled=\"true\">" + NL + "\t\t\t\t\t<reference" + NL + "\t\t\t\t\t\tdefinitionId=\"";
  protected final String TEXT_41 = "\">" + NL + "\t\t\t\t\t</reference>" + NL + "            </visibleWhen>" + NL + "            <parameter" + NL + "                  name=\"";
  protected final String TEXT_42 = "\"" + NL + "                  value=\"";
  protected final String TEXT_43 = "\">" + NL + "            </parameter> " + NL + "         </command>";
  protected final String TEXT_44 = "         " + NL + "      </menuContribution>" + NL + "   </extension>";
  protected final String TEXT_45 = NL + "</plugin>";
  protected final String TEXT_46 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
/**
 * <copyright>
 *
 * Copyright (c) 2002-2010 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 *   IBM - Initial API and implementation
 *
 * </copyright>
 */

    GenModel2 genModel = (GenModel2)argument;
    stringBuffer.append(TEXT_1);
    stringBuffer.append(TEXT_2);
    stringBuffer.append(TEXT_3);
    {GenBase copyrightHolder = argument instanceof GenBase ? (GenBase)argument : argument instanceof Object[] && ((Object[])argument)[0] instanceof GenBase ? (GenBase)((Object[])argument)[0] : null;
    if (copyrightHolder != null && copyrightHolder.hasCopyright()) {
    stringBuffer.append(TEXT_4);
    stringBuffer.append(copyrightHolder.getCopyright(copyrightHolder.getGenModel().getIndentation(stringBuffer)));
    } else {
    stringBuffer.append(TEXT_5);
    stringBuffer.append(TEXT_6);
    stringBuffer.append("$");
    stringBuffer.append(TEXT_7);
    stringBuffer.append("$");
    }}
    stringBuffer.append(TEXT_8);
    if (genModel.isBundleManifest()) {
    stringBuffer.append(TEXT_9);
    } else {
    stringBuffer.append(TEXT_10);
    stringBuffer.append(genModel.getGeneratorUIPluginID());
    stringBuffer.append(TEXT_11);
    stringBuffer.append(genModel.getQualifiedEditorPluginClassName());
    stringBuffer.append(TEXT_12);
    for (String pluginID : genModel.getGeneratorUIRequiredPlugins()) { 
    stringBuffer.append(TEXT_13);
    stringBuffer.append(pluginID);
    stringBuffer.append(TEXT_14);
    if (!pluginID.startsWith("org.eclipse.core.runtime")) {
    stringBuffer.append(TEXT_15);
    }
    stringBuffer.append(TEXT_16);
    }
    stringBuffer.append(TEXT_17);
    if (genModel.isRuntimeJar()) {
    stringBuffer.append(TEXT_18);
    stringBuffer.append(genModel.getGeneratorUIPluginID());
    stringBuffer.append(TEXT_19);
    } else {
    stringBuffer.append(TEXT_20);
    }
    stringBuffer.append(TEXT_21);
    }
    stringBuffer.append(TEXT_22);
    stringBuffer.append(genModel.getGenerateCommandCategoryId());
    stringBuffer.append(TEXT_23);
    for (GenPackage genPackage : genModel.getAllGenPackagesWithClassifiers()) {
    if (genPackage instanceof GenPackage2 &&!genPackage.getGenClasses().isEmpty()) {
    stringBuffer.append(TEXT_24);
    stringBuffer.append(genModel.getGenerateCommandCategoryId());
    stringBuffer.append(TEXT_25);
    stringBuffer.append(((GenPackage2)genPackage).getGenerateCommandId());
    stringBuffer.append(TEXT_26);
    stringBuffer.append(genPackage.getPrefix());
    stringBuffer.append(TEXT_27);
    stringBuffer.append(((GenPackage2)genPackage).getGenerateProjectTypesCommandParameterId());
    stringBuffer.append(TEXT_28);
    stringBuffer.append(genPackage.getPrefix());
    stringBuffer.append(TEXT_29);
    }
    }
    stringBuffer.append(TEXT_30);
    for (GenPackage genPackage : genModel.getAllGenPackagesWithClassifiers()) {
    if (genPackage instanceof GenPackage2 &&!genPackage.getGenClasses().isEmpty()) {
    stringBuffer.append(TEXT_31);
    stringBuffer.append(((GenPackage2)genPackage).getQualifiedGeneratorHandlerClassName());
    stringBuffer.append(TEXT_32);
    stringBuffer.append(((GenPackage2)genPackage).getGenerateCommandId());
    stringBuffer.append(TEXT_33);
    }
    }
    for (GenPackage genPackage : genModel.getAllGenPackagesWithClassifiers()) {
    if (genPackage instanceof GenPackage2 &&!genPackage.getGenClasses().isEmpty()) {
    stringBuffer.append(TEXT_34);
    stringBuffer.append(genPackage.getQualifiedEditorClassName());
    stringBuffer.append(TEXT_35);
    for (String projectType : genModel.getGeneratorProjectTypes()) {
    stringBuffer.append(TEXT_36);
    stringBuffer.append(((GenPackage2)genPackage).getGenerateCommandId());
    stringBuffer.append(TEXT_37);
    stringBuffer.append(((GenPackage2)genPackage).getGenerateIconRelativePath());
    stringBuffer.append(TEXT_38);
    stringBuffer.append(genPackage.getPackageName());
    stringBuffer.append(TEXT_39);
    stringBuffer.append(projectType);
    stringBuffer.append(TEXT_40);
    stringBuffer.append(((GenPackage2)genPackage).getGeneratableModelElementsExpressionId());
    stringBuffer.append(TEXT_41);
    stringBuffer.append(((GenPackage2)genPackage).getGenerateProjectTypesCommandParameterId());
    stringBuffer.append(TEXT_42);
    stringBuffer.append(((GenPackage2)genPackage).getQuallifiedGenerateProjectTypeId(projectType));
    stringBuffer.append(TEXT_43);
    }
    stringBuffer.append(TEXT_44);
    }
    }
    stringBuffer.append(TEXT_45);
    stringBuffer.append(TEXT_46);
    return stringBuffer.toString();
  }
}
