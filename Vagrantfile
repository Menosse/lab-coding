# -*- mode: ruby -*-
# vi: set ft=ruby :

Vagrant.configure("2") do |config|

    ## Escolha da Box (Imagem)
    config.vm.box = "ubuntu/focal64"
  
    ## WORKSPACE
    config.vm.define 'labcoding' do |labcoding|
      labcoding.vm.hostname = "labcoding"
  
      # Configurações de Tamanho da VM
      labcoding.vm.provider "virtualbox" do |v|
        v.name = "labcoding"
        v.memory = 4096
        v.cpus = 4
      end
  
      # Instala o Ansible e faz as configurações da VM
      labcoding.vm.provision :ansible_local do |ansible|
          ansible.install_mode = "default"
          ansible.playbook = "ansible/playbook.yml"
          ansible.verbose  = "vvv"
        #   ansible.verbose  = true
          ansible.install  = true
          ansible.limit    = "all" 
          ansible.inventory_path = "ansible/inventory"
      end
  
    end
  
  end
  