package org.sourcepit.emfx.codegen.ecore.templates.generator.ui;

import java.util.*;
import org.eclipse.emf.codegen.ecore.genmodel.*;
import org.sourcepit.emfx.codegen.ecore.genmodel2.*;

public class PluginProperties
{
  protected static String nl;
  public static synchronized PluginProperties create(String lineSeparator)
  {
    nl = lineSeparator;
    PluginProperties result = new PluginProperties();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "# ";
  protected final String TEXT_2 = NL + "# <copyright>" + NL + "# </copyright>" + NL + "#" + NL + "# ";
  protected final String TEXT_3 = "Id";
  protected final String TEXT_4 = NL + NL + "pluginName = ";
  protected final String TEXT_5 = " Editor" + NL + "providerName = www.example.org" + NL + "" + NL + "_UI_GenerateCommandCategory_name = Generate Code" + NL + "_UI_GenerateCommandCategory_description = Generate code" + NL;
  protected final String TEXT_6 = NL + "_UI_";
  protected final String TEXT_7 = "_GenerateCommand_name = Generate ";
  protected final String TEXT_8 = NL + "_UI_";
  protected final String TEXT_9 = "_GenerateCommand_ProjectTypesParameter_name = ";
  protected final String TEXT_10 = " Project Types";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
/**
 * <copyright>
 *
 * Copyright (c) 2002-2006 IBM Corporation and others.
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

    GenModel genModel = (GenModel)argument; /* Trick to import java.util.* without warnings */Iterator.class.getName();
    {GenBase copyrightHolder = argument instanceof GenBase ? (GenBase)argument : argument instanceof Object[] && ((Object[])argument)[0] instanceof GenBase ? (GenBase)((Object[])argument)[0] : null;
    if (copyrightHolder != null && copyrightHolder.hasCopyright()) {
    stringBuffer.append(TEXT_1);
    stringBuffer.append(copyrightHolder.getCopyright(copyrightHolder.getGenModel().getIndentation(stringBuffer)));
    } else {
    stringBuffer.append(TEXT_2);
    stringBuffer.append("$");
    stringBuffer.append(TEXT_3);
    stringBuffer.append("$");
    }}
    stringBuffer.append(TEXT_4);
    stringBuffer.append(genModel.getModelName());
    stringBuffer.append(TEXT_5);
    for (GenPackage genPackage : genModel.getAllGenAndUsedGenPackagesWithClassifiers()) {
    if (genPackage.getGenModel() == genModel || !(genPackage.getGenModel() instanceof GenModel2 && ((GenModel2)genPackage.getGenModel()).hasGeneratorSupport())) {
    stringBuffer.append(TEXT_6);
    stringBuffer.append(genPackage.getPrefix());
    stringBuffer.append(TEXT_7);
    stringBuffer.append(genPackage.getPackageName());
    stringBuffer.append(TEXT_8);
    stringBuffer.append(genPackage.getPrefix());
    stringBuffer.append(TEXT_9);
    stringBuffer.append(genPackage.getPackageName());
    stringBuffer.append(TEXT_10);
    }
    }
    return stringBuffer.toString();
  }
}
