package org.sourcepit.emfx.codegen.ecore.templates.generator;

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
  protected final String TEXT_22 = NL + "   <extension" + NL + "         point=\"org.eclipse.emf.codegen.ecore.generatorAdapters\">" + NL + "      <adapterFactory" + NL + "            class=\"";
  protected final String TEXT_23 = "\"" + NL + "            modelPackage=\"";
  protected final String TEXT_24 = "\">" + NL + "      </adapterFactory>" + NL + "   </extension>";
  protected final String TEXT_25 = NL + "   <extension point=\"org.eclipse.core.expressions.definitions\">" + NL + "      <definition id=\"";
  protected final String TEXT_26 = "\">" + NL + "         <iterate" + NL + "            isEmpty=\"false\"" + NL + "            operator=\"or\">" + NL + "               <or>";
  protected final String TEXT_27 = "                 " + NL + "                  <instanceof" + NL + "                     value=\"";
  protected final String TEXT_28 = "\">" + NL + "                  </instanceof>";
  protected final String TEXT_29 = "                  ";
  protected final String TEXT_30 = NL + "               </or>             " + NL + "            </iterate>" + NL + "      </definition>" + NL + "   </extension>   ";
  protected final String TEXT_31 = NL + "</plugin>";
  protected final String TEXT_32 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
/**
 * <copyright>
 *
 * Copyright (c) 2002-2005 IBM Corporation and others.
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
    stringBuffer.append(genModel.getGeneratorPluginID());
    stringBuffer.append(TEXT_11);
    stringBuffer.append(genModel.getQualifiedGeneratorPluginClassName());
    stringBuffer.append(TEXT_12);
    for (String pluginID : genModel.getGeneratorRequiredPlugins()) {
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
    stringBuffer.append(genModel.getGeneratorPluginID());
    stringBuffer.append(TEXT_19);
    } else {
    stringBuffer.append(TEXT_20);
    }
    stringBuffer.append(TEXT_21);
    }
    for (GenPackage genPackage : genModel.getAllGenPackagesWithClassifiers()) {
    if (genPackage instanceof GenPackage2 &&!genPackage.getGenClasses().isEmpty()) {
    stringBuffer.append(TEXT_22);
    stringBuffer.append(((GenPackage2)genPackage).getQualifiedGeneratorAdapterFactoryClassName());
    stringBuffer.append(TEXT_23);
    stringBuffer.append(genPackage.getNSURI());
    stringBuffer.append(TEXT_24);
    }
    }
    for (GenPackage genPackage : genModel.getAllGenPackagesWithClassifiers()) {
    if (genPackage instanceof GenPackage2 &&!genPackage.getGenClasses().isEmpty()) {
    stringBuffer.append(TEXT_25);
    stringBuffer.append(((GenPackage2)genPackage).getGeneratableModelElementsExpressionId());
    stringBuffer.append(TEXT_26);
    for (GenClass genClass : genPackage.getGenClasses()) {
    if (genClass instanceof GenClass2 && ((GenClass2)genClass).canGenerateGenerator()) {
    stringBuffer.append(TEXT_27);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_28);
    }
    stringBuffer.append(TEXT_29);
    }
    stringBuffer.append(TEXT_30);
    }
    }
    stringBuffer.append(TEXT_31);
    stringBuffer.append(TEXT_32);
    return stringBuffer.toString();
  }
}
