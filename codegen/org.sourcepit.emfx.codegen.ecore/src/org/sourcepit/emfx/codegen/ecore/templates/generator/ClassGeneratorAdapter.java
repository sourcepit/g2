package org.sourcepit.emfx.codegen.ecore.templates.generator;

import org.eclipse.emf.codegen.ecore.genmodel.*;
import org.sourcepit.emfx.codegen.ecore.genmodel2.*;

public class ClassGeneratorAdapter
{
  protected static String nl;
  public static synchronized ClassGeneratorAdapter create(String lineSeparator)
  {
    nl = lineSeparator;
    ClassGeneratorAdapter result = new ClassGeneratorAdapter();
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
  protected final String TEXT_8 = NL + NL + "/**" + NL + " * <!-- begin-user-doc -->" + NL + " * <!-- end-user-doc -->" + NL + " * @generated" + NL + " */" + NL + "public class ";
  protected final String TEXT_9 = " extends ";
  protected final String TEXT_10 = NL + "{" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_11 = "(";
  protected final String TEXT_12 = " generatorAdapterFactory)" + NL + "\t{" + NL + "\t\tsuper(generatorAdapterFactory);" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected JETEmitterDescriptor[] getJETEmitterDescriptors()" + NL + "\t{" + NL + "\t\tthrow new UnsupportedOperationException();" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\t@Override" + NL + "\tpublic boolean canGenerate(Object object, Object projectType)" + NL + "\t{" + NL + "\t\tthrow new UnsupportedOperationException();" + NL + "\t}" + NL + "\t" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\t@Override" + NL + "\tprotected ";
  protected final String TEXT_13 = " doGenerate(Object object, Object projectType," + NL + "\t\t\t";
  protected final String TEXT_14 = " monitor) throws Exception {" + NL + "\t\tthrow new UnsupportedOperationException();" + NL + "\t}" + NL + "}";
  protected final String TEXT_15 = NL;

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

    GenClass2   genClass       = (GenClass2) argument;
    GenPackage2 genPackage     = genClass.getGenPackage();
    GenModel2   genModel       = genPackage.getGenModel();
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
    stringBuffer.append(genModel.getGeneratorPluginPackageName());
    stringBuffer.append(TEXT_7);
    genModel.markImportLocation(stringBuffer);
    stringBuffer.append(TEXT_8);
    stringBuffer.append(genClass.getGeneratorAdapterClassName());
    stringBuffer.append(TEXT_9);
    stringBuffer.append(genPackage.getGeneratorAdapterBaseClassName());
    stringBuffer.append(TEXT_10);
    stringBuffer.append(genClass.getGeneratorAdapterClassName());
    stringBuffer.append(TEXT_11);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.codegen.ecore.generator.GeneratorAdapterFactory"));
    stringBuffer.append(TEXT_12);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.Diagnostic"));
    stringBuffer.append(TEXT_13);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.Monitor"));
    stringBuffer.append(TEXT_14);
    genModel.emitSortedImports();
    stringBuffer.append(TEXT_15);
    return stringBuffer.toString();
  }
}
