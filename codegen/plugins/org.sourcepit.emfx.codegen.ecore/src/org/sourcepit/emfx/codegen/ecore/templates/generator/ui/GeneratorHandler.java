package org.sourcepit.emfx.codegen.ecore.templates.generator.ui;

import org.eclipse.emf.codegen.ecore.genmodel.*;
import org.sourcepit.emfx.codegen.ecore.genmodel2.*;

public class GeneratorHandler
{
  protected static String nl;
  public static synchronized GeneratorHandler create(String lineSeparator)
  {
    nl = lineSeparator;
    GeneratorHandler result = new GeneratorHandler();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = "/**";
  protected final String TEXT_3 = NL + " * ";
  protected final String TEXT_4 = NL + " * <copyright>" + NL + " * </copyright>" + NL + " *" + NL + " * ";
  protected final String TEXT_5 = "Id";
  protected final String TEXT_6 = NL + " */" + NL + "package ";
  protected final String TEXT_7 = ";" + NL;
  protected final String TEXT_8 = NL + NL + "import java.util.ArrayList;" + NL + "import java.util.List;" + NL + "" + NL + "import org.eclipse.core.commands.ExecutionEvent;" + NL + "/**" + NL + " * <!-- begin-user-doc -->" + NL + " * <!-- end-user-doc -->" + NL + " * @generated" + NL + " */" + NL + "public class ";
  protected final String TEXT_9 = " extends ";
  protected final String TEXT_10 = " {" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected final static String PROJECT_TYPE_PARAMETER_ID = \"";
  protected final String TEXT_11 = "\";" + NL + "\t" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\t@Override" + NL + "\tprotected boolean isGeneratorInput(Object selected) {";
  protected final String TEXT_12 = NL + "\t\tif (selected instanceof ";
  protected final String TEXT_13 = ") {" + NL + "\t\t\treturn true;                   " + NL + "\t\t}";
  protected final String TEXT_14 = "                  ";
  protected final String TEXT_15 = "  \t" + NL + "\t\treturn false;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\t@Override" + NL + "\tprotected List<Object> getProjectTypes(ExecutionEvent event," + NL + "\t\t\tList<Object> generatorInput) {" + NL + "\t\tList<Object> projectTypes = new ArrayList<Object>();" + NL + "\t\tString rawProjectTypes = event.getParameter(PROJECT_TYPE_PARAMETER_ID);" + NL + "\t\tif (rawProjectTypes != null)" + NL + "\t\t{" + NL + "\t\t\tfor (String projectType : rawProjectTypes.split(\" \"))" + NL + "\t\t\t{" + NL + "\t\t\t\tprojectTypes.add(projectType);" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\telse" + NL + "\t\t{" + NL + "\t\t\tprojectTypes.add(null);" + NL + "\t\t}" + NL + "\t\treturn projectTypes;" + NL + "\t}" + NL + "}";
  protected final String TEXT_16 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
/**
 * <copyright>
 *
 * Copyright (c) 2002-2004 IBM Corporation and others.
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

    final GenPackage2 genPackage     = (GenPackage2) argument;
    final GenModel2   genModel       = genPackage.getGenModel();
    stringBuffer.append(TEXT_1);
    stringBuffer.append(TEXT_2);
    {GenBase copyrightHolder = argument instanceof GenBase ? (GenBase)argument : argument instanceof Object[] && ((Object[])argument)[0] instanceof GenBase ? (GenBase)((Object[])argument)[0] : null;
    if (copyrightHolder != null && copyrightHolder.hasCopyright()) {
    stringBuffer.append(TEXT_3);
    stringBuffer.append(copyrightHolder.getCopyright(copyrightHolder.getGenModel().getIndentation(stringBuffer)));
    } else {
    stringBuffer.append(TEXT_4);
    stringBuffer.append("$");
    stringBuffer.append(TEXT_5);
    stringBuffer.append("$");
    }}
    stringBuffer.append(TEXT_6);
    stringBuffer.append(genPackage.getGeneratorHandlerPackageName());
    stringBuffer.append(TEXT_7);
    genModel.markImportLocation(stringBuffer);
    stringBuffer.append(TEXT_8);
    stringBuffer.append(genPackage.getGeneratorHandlerClassName());
    stringBuffer.append(TEXT_9);
    stringBuffer.append(genModel.getImportedName("org.sourcepit.emfx.codegen.ecore.ui.handlers.AbstractGeneratorHandler"));
    stringBuffer.append(TEXT_10);
    stringBuffer.append(genPackage.getGenerateProjectTypesCommandParameterId());
    stringBuffer.append(TEXT_11);
    for (GenClass genClass : genPackage.getGenClasses()) {
    if (genClass instanceof GenClass2 && ((GenClass2)genClass).canGenerateGenerator()) {
    stringBuffer.append(TEXT_12);
    stringBuffer.append(genModel.getImportedName(genClass.getQualifiedInterfaceName()));
    stringBuffer.append(TEXT_13);
    }
    stringBuffer.append(TEXT_14);
    }
    stringBuffer.append(TEXT_15);
    genModel.emitSortedImports();
    stringBuffer.append(TEXT_16);
    return stringBuffer.toString();
  }
}
